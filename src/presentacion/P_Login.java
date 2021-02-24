package presentacion;

import dominio.Carrito;
import dominio.Cliente;
import dominio.Personal;
import dominio.logica.LN_Carrito;
import dominio.logica.LN_User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P_Login implements ActionListener{
    private IV_Login vista;
    private LN_User logica = new LN_User();
    private LN_Carrito logicaC = new LN_Carrito();
    
    public P_Login(IV_Login vista) {
        this.vista = vista;
    }
    
    public void registrar(){
        IV_Registrar vistaR = new V_Registrar();
        P_Registrar p = new P_Registrar(vistaR, new Cliente());
        vistaR.setPresentador(p);
        vistaR.iniciar();
        vista.close();       
    }   
    
    public void ingresar(){
        Cliente cliente = new Cliente();
        cliente.setCorreo(vista.getCorreo());
        cliente.setContraseña(vista.getClave());        
        
        Personal p= new Personal();
        p.setCorreo(vista.getCorreo());
        p.setContraseña(vista.getClave());
        
        cliente = logica.logear(cliente);
        Personal personal = logica.logear(p);
        
        if (personal!=null) {
            IV_MenuAdmin vistaP = new V_MenuAdmin();
            P_MenuAdmin pres = new P_MenuAdmin(vistaP, personal);
            vistaP.setPresentador(pres);
            vistaP.iniciar();
            vista.close();
        }else if(cliente!= null){
            Carrito carrito = logicaC.buscar(Integer.valueOf(cliente.getId()));
            cliente.setCarrito(carrito);
            IV_MenuCliente vistaC = new V_MenuCliente();
            P_MenuCliente pres = new P_MenuCliente(vistaC, cliente);
            vistaC.setPresentador(pres);
            vistaC.iniciar();
            vista.close();                  
        }else{
            vista.setMsm("Cuenta no Registrada...");
        }
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals(IV_Login.registrar)){
            registrar();
        }else if(e.getActionCommand().equals(IV_Login.ingresar)){
            ingresar();
        }
    }
}
