package presentacion;

import dominio.Cliente;
import dominio.ItemsPedido;
import dominio.Pedido;
import dominio.logica.LN_Item;
import dominio.logica.LN_Pedido;
import java.text.SimpleDateFormat;

public class P_Pedido{
    private final IV_Pedido vista;
    private final Cliente cliente;  
    private final LN_Item logicI = new LN_Item();
    private final LN_Pedido logicP = new LN_Pedido();

    public P_Pedido(IV_Pedido vista, Cliente cliente) {
        this.vista = vista;
        this.cliente = cliente;
    }
    
    public void salir(){
        IV_Login vistaL = new V_Login();
        P_Login presentador = new P_Login(vistaL);
        vistaL.setPresentador(presentador);
        vistaL.iniciar();
        vista.close();
    }
    
    public void Carrito(){
        IV_Carrito vistaC = new V_Carrito();
        P_Carrito presentador = new P_Carrito(vistaC, cliente);
        vistaC.setPresentador(presentador);
        vistaC.iniciar();
        vista.close();
    }
    
    public void inicio(){
        IV_MenuCliente vistaC = new V_MenuCliente();
        P_MenuCliente pres = new P_MenuCliente(vistaC, cliente);
        vistaC.setPresentador(pres);
        vistaC.iniciar();
        vista.close();  
    }
    
    public void iniciarDatos(){
        cliente.setPedidos(logicP.buscar(cliente));
        Pedido pedido = cliente.buscarPedido(String.valueOf(vista.getIdPedido()));

        //System.out.println("-->"+pedido.getItems().get(0).getId());
       
        vista.setCorreo(cliente.getCorreo());
        vista.setDNI(String.valueOf(cliente.getDNI()));
        vista.setDireccion(cliente.getDireccion());
        vista.setResponsable(cliente.getNombre()+" "+cliente.getApellido());
        vista.setNumero(String.valueOf(cliente.getNumMovil()));
        
        
        vista.setEstado(pedido.getEstado());
        vista.setFecha(new SimpleDateFormat("yyyy-MM-dd").format(pedido.getFecha()));        
        vista.setPago(pedido.getMetodoPago().getMetodo());
        vista.setItems(pedido);
        Double total = 0.0;
        for(ItemsPedido item: pedido.getItems()){
            total += item.getCantidad()*item.getProducto().getPrecio();
        }
        vista.setTotal("   S/ "+String.valueOf(total));
    }
            
    public void listarPedidos(){
        cliente.setPedidos(logicP.buscar(cliente));
        vista.setPedidos(cliente);       
    }

}
