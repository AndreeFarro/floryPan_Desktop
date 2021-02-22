package dominio.logica;

import java.util.List;
import persistencia.DaoFactory;
import persistencia.DaoFactoryJDBC;

public abstract class LN<T> {
    DaoFactory db = new DaoFactoryJDBC();
    
    public abstract void crear(T obj);
    public abstract void eliminar(T obj);
    public abstract void actualizar(T obj);
    public abstract T buscar(int id);
    public abstract T buscar(String nombre);
    public abstract List<T> listado(); 
}
