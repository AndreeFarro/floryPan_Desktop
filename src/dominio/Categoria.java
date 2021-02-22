package dominio;

import java.util.ArrayList;

public class Categoria {
    private String id;
    private String nombre;
    private ArrayList<Producto> productos = new ArrayList();

    public Categoria(){}
    public Categoria(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    public void quitarProducto(Producto p){
        productos.remove(p);
    }
    public Producto buscarProducto(String id){
        for(Producto p: productos){
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
