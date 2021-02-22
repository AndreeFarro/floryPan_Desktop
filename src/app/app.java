package app;

import persistencia.Conexion;
import presentacion.IV_Login;
import presentacion.P_Login;
import presentacion.V_Login;

public class app {

    public static void main(String[] args) {
        Conexion.getInstance();
        IV_Login vista = new V_Login();
        P_Login presentador = new P_Login(vista);
        vista.setPresentador(presentador);
        vista.iniciar();
    }
    
}
