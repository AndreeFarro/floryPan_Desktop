package presentacion;

import dominio.Cliente;
import dominio.ItemsPedido;
import dominio.Pedido;
import dominio.logica.LN_Carrito;
import dominio.logica.LN_Item;
import dominio.logica.LN_MetodoPago;
import dominio.logica.LN_Pedido;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

public class P_Carrito {
    private final IV_Carrito vista;
    private final Cliente cliente;  
    private final LN_Item logicI = new LN_Item();
    private final LN_Carrito logicC = new LN_Carrito();
    private final LN_MetodoPago logicMetodo = new LN_MetodoPago();
    private final LN_Pedido logicPedido = new LN_Pedido();

    public P_Carrito(IV_Carrito vista, Cliente cliente) {
        this.vista = vista;
        this.cliente = cliente;
    }    
    public void cambiarVistainicio(){
        IV_MenuCliente vistaC = new V_MenuCliente();
        P_MenuCliente pres = new P_MenuCliente(vistaC, cliente);
        vistaC.setPresentador(pres);
        vistaC.iniciar();
        vista.close();  
    }
    public void cambiarVistaPedidos(){
        IV_Pedido vistaP = new V_Pedidos();
        P_Pedido pres = new P_Pedido(vistaP, cliente);
        vistaP.setPresentador(pres);
        vistaP.iniciar();
        vista.close();  
    }   
    public void CerrarVentana(){
        IV_Login vistaL = new V_Login();
        P_Login presentador = new P_Login(vistaL);
        vistaL.setPresentador(presentador);
        vistaL.iniciar();
        vista.close();
    }
    
    public void ListarItems(){
        vista.setItems(cliente.getCarrito());
        llenardatosPedido();
    }
    
    public void eliminarItem(){        
        ItemsPedido item = cliente.getCarrito().buscar(vista.getIdItem());        
        if(item!=null){
            cliente.getCarrito().quitarItem(item);
            logicI.eliminar(item);
            ListarItems();
        }     
    }
    
    public void llenarMetodosPago(){
        List<String> filas = new ArrayList();
        logicMetodo.listado().forEach((c) -> {
            filas.add("    "+c.getId()+" - "+c.getMetodo());
        });
        vista.setPagos(filas);
    }
    public String encontrar(){
        int i = 0;String id= "";
        String[] datos = new String[2];
        StringTokenizer st = new StringTokenizer(vista.getPago(), "-");
        while (st.hasMoreTokens()) {
            datos[i] = st.nextToken();
            i++;
        }
        id = datos[0].replace(" ","");
        return id;
    }
    
    public void vaciarCarrito(){
        logicC.eliminarItems(cliente.getCarrito());
        cliente.getCarrito().setListaItems(new ArrayList());
        logicC.vaciarCarrito(cliente.getCarrito());
        ListarItems();
    }
    
    public void llenardatosPedido(){
        vista.setDireccion(cliente.getDireccion());   
        int numeroProductos= 0;
        int numeroUnidades = 0;
        Double precioTotal = 0.0;
        
        for(ItemsPedido item: cliente.getCarrito().getListaItems()){
            numeroProductos += 1;
            numeroUnidades += item.getCantidad();
            precioTotal += item.getCantidad()*item.getProducto().getPrecio();
        }
        vista.setProductos(String.valueOf(numeroProductos)+" Productos");
        vista.setUnidades(String.valueOf(numeroUnidades)+" Unidades");
        vista.setPrecioTotal("S/ "+String.valueOf(precioTotal));
        llenarMetodosPago();
    }
    
    public String encontrarPago(){
        int i = 0;
        String id= "";
        String[] datos = new String[2];
        StringTokenizer st = new StringTokenizer(vista.getPago(), "-");
        while (st.hasMoreTokens()) {
            datos[i] = st.nextToken();
            i++;
        }
        id = datos[0].replace(" ","");
        return id;
    }
    
    public void relizarPedido(){
        if (cliente.getCarrito().getListaItems().size()>0) {          
            Date myDate = new Date();
            Pedido pedido = new Pedido();
            
            pedido.setDireccion(vista.getDireccion());
            pedido.setFecha(myDate);
            pedido.setMetodoPago(logicMetodo.buscar(Integer.valueOf(encontrarPago())));                

            pedido.setItems(cliente.getCarrito().getListaItems());
            logicPedido.crear(pedido, Integer.valueOf(cliente.getId()));
            Pedido Aux = logicPedido.agregado();      
            logicI.actualizar(Integer.valueOf(cliente.getId()), Integer.valueOf(Aux.getId()));

            vaciarCarrito();
        }
    }
}
