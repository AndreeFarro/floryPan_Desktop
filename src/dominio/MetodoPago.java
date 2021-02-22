package dominio;
public class MetodoPago {
    private int id;
    private String metodo;
    private String codigo;

    public MetodoPago() {
    }

    public MetodoPago(int id, String metodo, String codigo) {
        this.id = id;
        this.metodo = metodo;
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
}
