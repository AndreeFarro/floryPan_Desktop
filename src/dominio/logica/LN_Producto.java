package dominio.logica;

import dominio.Producto;
import java.util.ArrayList;
import java.util.List;

public class LN_Producto extends LN<Producto> {

    @Override
    public void crear(Producto obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Producto obj) {
        super.db.getProductoDao().eliminar(obj);
    }

    @Override
    public void actualizar(Producto obj) {
        super.db.getProductoDao().actualizar(obj);
    }

    @Override
    public Producto buscar(int id) {
        return super.db.getProductoDao().buscar(id);
    }

    @Override
    public Producto buscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Producto> listado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
