package dominio.logica;

import dominio.Cliente;
import dominio.Pedido;
import java.util.ArrayList;
import java.util.List;

public class LN_Pedido extends LN<Pedido> {

    @Override
    public void crear(Pedido obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void crear(Pedido obj,int id) {
        super.db.getPedidoDao().crearPedido(obj, id);
    }   
    
    public ArrayList<Pedido> buscar(Cliente cliente){
        return super.db.getPedidoDao().buscar(cliente);
    }
    
    public Pedido agregado(){
        return super.db.getPedidoDao().agregado();
    }
   
    @Override
    public void eliminar(Pedido obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Pedido obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pedido buscar(int id) {
        return super.db.getPedidoDao().buscar(id);
    }

    @Override
    public Pedido buscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pedido> listado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
