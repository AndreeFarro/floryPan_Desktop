package presentacion;

public interface IV_Registrar {
    public void setPresentador(P_Registrar p);
    public void iniciar();
    public void close();
    public boolean VerificacionDeCampos();
    public boolean VerificacionDeClave();
    public void setInformar(String s);
    public void setClaveInfo(String s);
    
    public String getNombre();
    public String getApellido();
    public String getCorreo();
    public String getContraseña();
    public String getDireccion();
    public String getNumero();
    public String getDNI();
    
    static final String registrar = "REGISTRARSE";
    static final String regresar = "Regresar";
}
