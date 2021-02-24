package persistencia;

import dominio.Categoria;
import dominio.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDao extends Dao<Categoria>{

    @Override
    public void crear(Categoria obj) {
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
    public void eliminar(Categoria obj) {
        try{
            String sql = "delete from categoria where id = ?";
            PreparedStatement statement = this.connect.prepareStatement(sql);
            statement.setInt(1,Integer.valueOf(obj.getId()));
            statement.execute();
        }catch (NumberFormatException | SQLException e){
        }
    }

    @Override
    public void actualizar(Categoria obj) {
    }

    @Override
    public Categoria buscar(int id) {
        Categoria c =null;
        try {
            String sql = "select * from categoria where id="+id;
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                c = new Categoria();
                c.setId(rs.getString(1));
                c.setNombre(rs.getString(2));  
            }                 
        }catch (SQLException e){
        } 
      return c;
    }

    @Override
    public Categoria buscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Categoria> listado() {
        ArrayList<Categoria> listaCategoria = new ArrayList();
        try {
            String sql = "select * from categoria";
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                Categoria c = new Categoria();
                c.setId(rs.getString(1));
                c.setNombre(rs.getString(2));                
                listaCategoria.add(c);
            }
   
        }catch (SQLException e){
        } 
        return listaCategoria;
    }
    
    public Categoria listarProductos(Categoria cat){
        try {
            String sql = "select * from producto where idCat="+cat.getId();
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                Producto p = new Producto();
                p.setId(rs.getString(1));
                p.setNombre(rs.getString(2));
                p.setPrecio(rs.getDouble(3));
                p.setStock(rs.getInt(4));
                p.setDescripcion(rs.getString(5));
                
                cat.agregarProducto(p);
            }
   
        }catch (SQLException e){
        }         
        return cat;
    }
    
    public void CrearProducto(Categoria obj) {
        try {
            for(Producto x: obj.getProductos()){
                String sql = "insert into producto values(default,?,?,?,?,?)";
                PreparedStatement statement = this.connect.prepareStatement(sql);
                statement.setString(1,x.getNombre());        
                statement.setDouble(2,x.getPrecio());     
                statement.setInt(3,x.getStock());     
                statement.setString(4,x.getDescripcion());     
                statement.setString(5,obj.getId());
                statement.execute();
            }
            
        }catch (SQLException e){
            System.out.println("error: "+e);
        }
    }
}
