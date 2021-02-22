package presentacion;

import dominio.Categoria;
import java.util.List;

public interface IV_MenuCliente {
    public void setPresentador(P_MenuCliente p);
    public void iniciar();
    public void close();
    public String getCategoria();
    public void setProductos(Categoria lista);
    public void setCategorias(List<String> s);
    public int getCantidadProducto();
    
    public void setNombre(String nombre);
    public void setCorreo(String correo);
    public void setApellido(String apellido);
    public void setContraseña(String clave);
    public void setDireccion(String direccion);
    public void setNumero(String numero);
    public void setDNI(String dni);
    
    public int getIdProducto();
    public String getNombre();
    public String getCorreo();
    public String getApellido();
    public String getContraseña();
    public String getDireccion();
    public String getNumero();
    public String getDNI();
    
    public void setNombrePro(String nombre);
    public void setPrecio(String precio);
    public void setStock(String stock);
    public void setDescripcion(String descripcion);
    public void setCategoria(String categoria);
    public void setTotal(String total);
    
}
