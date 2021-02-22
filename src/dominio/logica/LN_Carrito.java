package dominio.logica;

import dominio.Carrito;
import java.util.List;

public class LN_Carrito extends LN<Carrito>{

    @Override
    public void crear(Carrito obj) {
        super.db.getCarrito().crear(obj);
    }

    @Override
    public void eliminar(Carrito obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void eliminarItems(Carrito obj) {
        super.db.getCarrito().eliminarItems(obj);
    }
    
    public void vaciarCarrito(Carrito obj){
        super.db.getCarrito().vaciarCarrito(obj);
    }

    @Override
    public void actualizar(Carrito obj) {
        super.db.getCarrito().actualizar(obj);
    }

    @Override
    public Carrito buscar(int id) {
        return super.db.getCarrito().buscar(id);
    }
    

    @Override
    public Carrito buscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Carrito> listado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
