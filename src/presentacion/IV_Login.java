package presentacion;
public interface IV_Login {
    public void setPresentador(P_Login p);
    public void iniciar();
    public void close();
    public void setMsm(String s);
    
    public String getCorreo();
    public String getClave();
    
    static final String registrar = "Registrarse";
    static final String ingresar = "INGRESAR";
}
