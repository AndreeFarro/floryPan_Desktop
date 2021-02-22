package dominio.logica;

import dominio.ItemsPedido;
import java.util.List;

public class LN_Item extends LN<ItemsPedido>{

    @Override
    public void crear(ItemsPedido obj) {
        super.db.getItemDao().crear(obj);
    }

    @Override
    public void eliminar(ItemsPedido obj) {
        super.db.getItemDao().eliminar(obj);
    }

    @Override
    public void actualizar(ItemsPedido obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void actualizar(int idCliente,int idPedido){
        super.db.getItemDao().actualizar(idCliente, idPedido);
    }

    public ItemsPedido Agregado(){
        return super.db.getItemDao().agregado();
    }
    
    @Override
    public ItemsPedido buscar(int id) {
        return super.db.getItemDao().buscar(id);
    }

    @Override
    public ItemsPedido buscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ItemsPedido> listado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
