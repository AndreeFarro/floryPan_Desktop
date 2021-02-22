package dominio;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private String id;
    private String direccion;
    private Date fecha;
    private String estado;
    private MetodoPago metodoPago;
    private ArrayList<ItemsPedido> items = new ArrayList();

    public Pedido(){}

    public Pedido(String id, String direccion, Date fecha, String estado, MetodoPago metodoPago) {
        this.id = id;
        this.direccion = direccion;
        this.fecha = fecha;
        this.estado = estado;
        this.metodoPago = metodoPago;
    }

    public void agregarItem(ItemsPedido item){
        items.add(item);
    }
    
    public ArrayList<ItemsPedido> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemsPedido> items) {
        this.items = items;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    
}
