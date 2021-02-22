package dominio;
public class Usuario {
    private String id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    private int numMovil;

    public Usuario(){}

    public Usuario(String id, String nombre, String apellido, String correo, String contraseña, int numMovil) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.numMovil = numMovil;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getNumMovil() {
        return numMovil;
    }

    public void setNumMovil(int numMovil) {
        this.numMovil = numMovil;
    }
    
}
