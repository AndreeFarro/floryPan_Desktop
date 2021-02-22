package presentacion;

import dominio.Carrito;
import java.util.List;

public interface IV_Carrito {
    public void setPresentador(P_Carrito p);
    public void iniciar();
    public void close();
    public void setItems(Carrito carrito);
    public int getIdItem();
    
    public void setDireccion(String s);
    public void setPagos(List<String> s);
    public void setProductos(String s);
    public void setUnidades(String s);
    public void setPrecioTotal(String s);
    
    public String getDireccion();
    public String getPago();
    
    
}
