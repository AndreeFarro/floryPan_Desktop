package presentacion;

import dominio.Categoria;
import java.util.List;

public interface IV_MenuAdmin {
    public void setPresentador(P_MenuAdmin p);
    public void iniciar();
    public void close();
    public String getCategoria();
    
    public void setProductos(Categoria lista);
    
    public String getNameCat();
    public String getNameProd();
    public String getPrecio();
    public String getStock();
    public String getDescripcion();
    
    public void setCategorias(List<String> s);
}
