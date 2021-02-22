package presentacion;

import dominio.Cliente;
import dominio.Pedido;

public interface IV_Pedido {
    public void setPresentador(P_Pedido p);
    public void iniciar();
    public void close();
    public void setPedidos(Cliente cliente);
    public int getIdPedido();
    public void setItems(Pedido pedido);
    
    public void setResponsable(String s);
    public void setDireccion(String s);
    public void setCorreo(String s);
    public void setNumero(String s);
    
    public void setDNI(String s);
    public void setFecha(String s);
    public void setPago(String s);
    public void setEstado(String s);
    public void setTotal(String s);

}
