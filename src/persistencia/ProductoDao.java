package persistencia;

import dominio.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDao extends Dao<Producto>{

    @Override
    public void crear(Producto obj) {
        try {
            String sql = "insert into categoria values(default,?)";
            PreparedStatement statement = this.connect.prepareStatement(sql);
            statement.setString(1,obj.getNombre());            
            statement.execute();
        }catch (SQLException e){
            System.out.println("error: "+e);
        }
    }

    @Override
    public void eliminar(Producto obj) {
        try{
            String sql = "delete from producto where id = ?";
            PreparedStatement statement = this.connect.prepareStatement(sql);
            statement.setInt(1,Integer.valueOf(obj.getId()));
            statement.execute();
        }catch (NumberFormatException | SQLException e){
        }
    }

    @Override
    public void actualizar(Producto obj) {
        try{
            String sql = "update producto set nombre = ?,precio=?,stock=?,descripcion=? where id ="+obj.getId();
            PreparedStatement statement = this.connect.prepareStatement(sql);
            statement.setString(1,obj.getNombre());
            statement.setDouble(2,obj.getPrecio());
            statement.setInt(3,obj.getStock());
            statement.setString(4,obj.getDescripcion());
            
            statement.execute();    
        }catch (NumberFormatException | SQLException e){            
        } 
    }

    @Override
    public Producto buscar(int id) {
        Producto p =null;
        try {
            String sql = "select * from producto where id="+id;
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                p = new Producto();
                p.setId(rs.getString(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setDescripcion(rs.getString(5));  
            }                 
        }catch (SQLException e){
        } 
      return p;
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
