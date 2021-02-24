package dominio.logica;

import dominio.Categoria;
import java.util.ArrayList;
import java.util.List;

public class LN_Categoria extends LN<Categoria> {

    @Override
    public void crear(Categoria obj) {
        super.db.getCategoriaDao().crear(obj);
    }
    
    public void CrearProducto(Categoria obj){
        super.db.getCategoriaDao().CrearProducto(obj);
    }
    
    public Categoria listaProductos(Categoria obj){
        return super.db.getCategoriaDao().listarProductos(obj);
    }

    @Override
    public void eliminar(Categoria obj) {
        super.db.getCategoriaDao().eliminar(obj);
    }

    @Override
    public void actualizar(Categoria obj) {

    }

    @Override
    public Categoria buscar(int id) {
        return super.db.getCategoriaDao().buscar(id);
    }

    @Override
    public Categoria buscar(String nombre) {
        return null;
    }

    @Override
    public ArrayList<Categoria> listado() {
        return super.db.getCategoriaDao().listado();
    }
    
}
