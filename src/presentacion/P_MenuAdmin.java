package presentacion;

import dominio.Categoria;
import dominio.Personal;
import dominio.Producto;
import dominio.logica.LN_Categoria;
import dominio.logica.LN_Producto;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P_MenuAdmin {

    private IV_MenuAdmin vista;
    private Personal personal;
    private LN_Categoria logicC = new LN_Categoria();
    private LN_Producto logicP = new LN_Producto();
    
    public P_MenuAdmin(IV_MenuAdmin vista, Personal personal) {
        this.vista = vista;
        this.personal = personal;
    }
    
    public void llenarCategorias(){
        List<String> filas = new ArrayList<String>();
        for(Categoria c: logicC.listado()){
            filas.add("    "+c.getId()+" - "+c.getNombre());
        }
        vista.setCategorias(filas);
    }
    
    public void crearCategoria(){
        Categoria categoria = new Categoria();
        categoria.setNombre(vista.getNameCat());
        logicC.crear(categoria);
        llenarCategorias();
    }
    
    public String encontrarIdCategoria(){
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
    
    public void crearProducto(){
        Producto producto = new Producto();
        producto.setNombre(vista.getNameProd());
        producto.setPrecio(Double.valueOf(vista.getPrecio()));
        producto.setStock(Integer.valueOf(vista.getStock()));
        producto.setDescripcion(vista.getDescripcion()); 
        
        Categoria c = new Categoria();
        c.setId(encontrarIdCategoria());
        c.agregarProducto(producto);
        
        logicC.CrearProducto(c);        
    }
    public void listarProductos(){
        Categoria c = new Categoria();
        c.setId(encontrarIdCategoria());
        c = logicC.listaProductos(c);
        if (c!=null) {
            vista.setProductos(c);
        }
    }
    
    public void actualizarProducto(String id){
        Producto producto = new Producto();
        producto.setId(id);
        producto.setNombre(vista.getNameProd());
        producto.setPrecio(Double.valueOf(vista.getPrecio()));
        producto.setStock(Integer.valueOf(vista.getStock()));
        producto.setDescripcion(vista.getDescripcion()); 
        logicP.actualizar(producto);
    }
    public void eliminarProducto(String id){
        Producto producto = new Producto();
        producto.setId(id);
        logicP.eliminar(producto);
    }
    
    public void eliminarCategoria(){
        Categoria c = new Categoria();
        c.setId(encontrarIdCategoria());
        logicC.eliminar(c);
    }
    
    public void cerrarVista(){
        IV_Login vistaL = new V_Login();
        P_Login presentador = new P_Login(vistaL);
        vistaL.setPresentador(presentador);
        vistaL.iniciar();
        vista.close();
    }
    
    public void cambiarVistapedidos(){
        IV_AdminPedidos vistaP = new V_AdminPedidos();
        P_AdminPedidos presentador = new P_AdminPedidos(vistaP, personal);
        vistaP.setPresentador(presentador);
        vistaP.iniciar();
        vista.close();
    }
}
