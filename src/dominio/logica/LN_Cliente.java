package dominio.logica;

import dominio.Cliente;
import java.util.ArrayList;

public class LN_Cliente extends LN<Cliente>{
    
    public void crearCliente(Cliente obj){
        db.getClienteDao().crear(obj);
    }

    @Override
    public void crear(Cliente obj) {
        db.getClienteDao().crear(obj);
    }

    @Override
    public void eliminar(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Cliente obj) {
        db.getClienteDao().actualizar(obj);
    }

    @Override
    public Cliente buscar(int id) {
        return db.getClienteDao().buscar(id);
    }

    @Override
    public Cliente buscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Cliente> listado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
