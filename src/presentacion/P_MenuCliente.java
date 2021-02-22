package presentacion;

import dominio.Categoria;
import dominio.Cliente;
import dominio.ItemsPedido;
import dominio.Producto;
import dominio.logica.LN_Carrito;
import dominio.logica.LN_Categoria;
import dominio.logica.LN_Cliente;
import dominio.logica.LN_Item;
import dominio.logica.LN_Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P_MenuCliente {
    private IV_MenuCliente vista;
    private Cliente cliente;
    private LN_Categoria logicC = new LN_Categoria();
    private LN_Producto logicP = new LN_Producto();
    private LN_Item logicI = new LN_Item();
    private LN_Carrito logicCarrito = new LN_Carrito();

    public P_MenuCliente(IV_MenuCliente vista, Cliente cliente) {
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
    public void Pedidos(){
        IV_Pedido vistaP = new V_Pedidos();
        P_Pedido pres = new P_Pedido(vistaP, cliente);
        vistaP.setPresentador(pres);
        vistaP.iniciar();
        vista.close();  
    }    
    public void inicio(){
        IV_MenuCliente vistaC = new V_MenuCliente();
        P_MenuCliente pres = new P_MenuCliente(vistaC, cliente);
        vistaC.setPresentador(pres);
        vistaC.iniciar();
        vista.close();  
    }
    public void perfil(){
        
    }
    public String encontrar(){
        int i = 0;
        String id= "";
        String[] datos = new String[2];
        StringTokenizer st = new StringTokenizer(vista.getCategoria(), "-");
        while (st.hasMoreTokens()) {
            datos[i] = st.nextToken();
            i++;
        }
        id = datos[0].replace(" ","");
        return id;
    }
    
    public void listarProductos(){
        Categoria c = new Categoria();
        c.setId(encontrar());
        c = logicC.listaProductos(c);
        if (c!=null) {
            vista.setProductos(c);
        }
    }
    public void llenarCategorias(){
        List<String> filas = new ArrayList<String>();
        for(Categoria c: logicC.listado()){
            filas.add("    "+c.getId()+" - "+c.getNombre());
        }
        vista.setCategorias(filas);
    }
    
    public void DefinirInformacionProducto(){
        Categoria c = logicC.buscar(Integer.valueOf(encontrar()));
        Producto p = logicP.buscar(vista.getIdProducto());
        
        vista.setCategoria("   "+c.getNombre());
        vista.setNombrePro(p.getNombre());
        vista.setDescripcion("   "+p.getDescripcion());
        vista.setPrecio("   "+String.valueOf(p.getPrecio()));
        vista.setStock("   "+String.valueOf(p.getStock())+" Unidades");
        vista.setTotal("S/ 0.00");                 
    }
    
    public void DefinirInformacionPerfil(){
        vista.setNombre(cliente.getNombre());
        vista.setContraseña(cliente.getContraseña());
        vista.setCorreo(cliente.getCorreo());
        vista.setDNI(String.valueOf(cliente.getDNI()));
        vista.setDireccion(cliente.getDireccion());
        vista.setNumero(String.valueOf(cliente.getNumMovil()));  
        vista.setApellido(cliente.getApellido());
    }
    public void actualizarCliente(){
        cliente.setNombre(vista.getNombre());
        cliente.setContraseña(vista.getContraseña());
        cliente.setCorreo(vista.getCorreo());
        cliente.setDNI(Integer.valueOf(vista.getDNI()));
        cliente.setDireccion(vista.getDireccion());
        cliente.setNumMovil(Integer.valueOf(vista.getNumero()));
        cliente.setApellido(vista.getApellido());
        LN_Cliente logicP = new LN_Cliente();
        logicP.actualizar(cliente);
        this.cliente = logicP.buscar(Integer.valueOf(cliente.getId()));
    }
    public void agregarCarrito(){
        ItemsPedido item = new ItemsPedido();
        item.setCantidad(vista.getCantidadProducto());
        item.setProducto(logicP.buscar(vista.getIdProducto()));
        logicI.crear(item);     
        
        cliente.getCarrito().agregarItem(logicI.Agregado());
        logicCarrito.actualizar(cliente.getCarrito());
    }
}
