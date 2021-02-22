package dominio;

import java.util.ArrayList;

public class Cliente extends Usuario{
    private String direccion;
    private int DNI;
    private Carrito carrito;
    private ArrayList<Pedido> pedidos = new ArrayList();

    public Cliente(){}

    public Cliente(String id, String nombre, String apellido, String correo, String contraseña, int numMovil,String direccion, int DNI) {
        super(id, nombre, apellido, correo, contraseña, numMovil);
        this.direccion = direccion;
        this.DNI = DNI;
    }
    
    public void agregarPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }
    
    public Pedido buscarPedido(String id){
        for (Pedido p: pedidos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    
    public Carrito getCarrito() {
        return carrito;
    }

    public void setCarrito(Carrito carrito) {
        this.carrito = carrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
    
}
