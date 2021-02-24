package persistencia;

import java.sql.Connection;
import java.util.ArrayList;

public abstract class Dao<T> {
    public Connection connect = Conexion.getInstance();
    public abstract void crear(T obj);
    public abstract void eliminar(T obj);
    public abstract void actualizar(T obj);
    public abstract T buscar(int id);
    public abstract T buscar(String nombre);
    public abstract ArrayList<T> listado(); 
    
}