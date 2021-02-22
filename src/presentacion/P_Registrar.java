package presentacion;

import dominio.Cliente;
import dominio.logica.LN_Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P_Registrar implements ActionListener{
    private IV_Registrar vista;
    private Cliente cliente;
    private LN_Cliente logic = new LN_Cliente();

    public P_Registrar(IV_Registrar vista, Cliente cliente) {
        this.vista = vista;
        this.cliente = cliente;
        System.out.println("Crear");
    }
    
    public void registrar(){
        if(vista.VerificacionDeCampos()){
            vista.setInformar("Porfavor Rellene todos los Campos..");
        }else if(vista.VerificacionDeClave()){     
            vista.setInformar("");vista.setClaveInfo("");
            
            cliente.setNombre(vista.getNombre());
            cliente.setApellido(vista.getApellido());
            cliente.setContraseña(vista.getContraseña());
            cliente.setCorreo(vista.getCorreo());
            cliente.setNumMovil(Integer.valueOf(vista.getNumero()));
            cliente.setDireccion(vista.getDireccion());
            cliente.setDNI(Integer.valueOf(vista.getDNI()));
            
            logic.crearCliente(cliente);            
            regresar();
        }else{
            vista.setClaveInfo("");vista.setInformar("");
            vista.setClaveInfo("Contraseñas Diferentes...");
        }        
    } 
    
    public void regresar(){
        IV_Login vistaL = new V_Login();
        P_Login presentador = new P_Login(vistaL);
        vistaL.setPresentador(presentador);
        vistaL.iniciar();
        vista.close();
    }

    @Override
    public void actionPerformed(ActionEvent e) {   
        if(e.getActionCommand().equals(IV_Registrar.registrar)){
            registrar();
        }else if(e.getActionCommand().equals(IV_Registrar.regresar)){
            regresar();
        }
    }   
}
