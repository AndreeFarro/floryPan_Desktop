package presentacion;

import dominio.Pedido;
import dominio.Personal;
import dominio.logica.LN_Pedido;
import java.util.ArrayList;

public class P_AdminPedidos {
    private IV_AdminPedidos vista;
    private final LN_Pedido logicP = new LN_Pedido();
    private final Personal personal;

    public P_AdminPedidos(IV_AdminPedidos vista,Personal personal) {
        this.vista = vista;
        this.personal = personal;
    }

    public void cerrar() {
        IV_Login vistaL = new V_Login();
        P_Login presentador = new P_Login(vistaL);
        vistaL.setPresentador(presentador);
        vistaL.iniciar();
        vista.close();
    }
    
    public void listarPedidos(){
        ArrayList<Pedido> pedidos = logicP.listado();
        vista.setPedidos(pedidos);       
    }
    
    public void inicio(){
        IV_MenuAdmin vistaP = new V_MenuAdmin();
        P_MenuAdmin pres = new P_MenuAdmin(vistaP, personal);
        vistaP.setPresentador(pres);
        vistaP.iniciar();
        vista.close();
    }
    
    public void listarItems(){
        Pedido pedidoAuxiliar = new Pedido();
        pedidoAuxiliar.setId(String.valueOf(vista.getIdPedido()));        
        vista.setItems(logicP.buscarItems(pedidoAuxiliar));
    }
    public void aprobarPedido(){
        Pedido pedidoAuxiliar = new Pedido();
        pedidoAuxiliar.setId(String.valueOf(vista.getIdPedido()));  
        pedidoAuxiliar.setEstado("APROBADO");
        logicP.AprobarPedido(pedidoAuxiliar);
        listarPedidos();
    }
    
    public void listarPedidosPendientes(){
        ArrayList<Pedido> pedidos = new ArrayList();
        for (Pedido p: logicP.listado()) {
            if (p.getEstado().equals("PENDIENTE")) {
                pedidos.add(p);
            }
        }
        vista.setPedidos(pedidos);       
    }
    
}
