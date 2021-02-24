package persistencia;

import dominio.ItemsPedido;
import dominio.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemDao extends Dao<ItemsPedido>{

    @Override
    public void crear(ItemsPedido obj) {
        try {
            String sql = "insert into item (id,idProducto,cantidad)values(default,?,?)";
            PreparedStatement statement = this.connect.prepareStatement(sql);
            statement.setString(1,obj.getProducto().getId());       
            statement.setInt(2,obj.getCantidad());           
            statement.execute();
        }catch (SQLException e){
            System.out.println("error: "+e);
        }
    }

    @Override
    public void eliminar(ItemsPedido obj) {
        try{
            String sql = "delete from item where id = ?";
            PreparedStatement statement = this.connect.prepareStatement(sql);
            statement.setInt(1,Integer.valueOf(obj.getId()));
            statement.execute();
        }catch (NumberFormatException | SQLException e){
        }
    }
    
    @Override
    public void actualizar(ItemsPedido obj) {}
    
    public void actualizar(int idCliente,int idPedido) {        
        try {
            String sql = "select * from carrito where idCliente="+idCliente;            
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while(rs.next()){
                String sql2 = "update item set idPedido = ? where id = ?";
                PreparedStatement st = this.connect.prepareStatement(sql2);
                st.setInt(1,idPedido);
                st.setString(2,rs.getString(2));
                st.execute();    
            }                 
        }catch (SQLException e){
            System.out.println("error: "+e);
        }               
      
    }

    @Override
    public ItemsPedido buscar(int id) {
        ItemsPedido c =null;
        try {
            String sql = "select * from item where id="+id;
            if (id==0) {
                sql = "SELECT * FROM item ORDER BY id DESC LIMIT 1";
            }              
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while(rs.next()){
                c = new ItemsPedido();           
                c.setId(rs.getString(1));
                c.setProducto(buscarProducto(rs.getInt(3)));
                c.setCantidad(rs.getInt(4));
            }                 
        }catch (SQLException e){
            System.out.println("error: "+e);
        } 
        return c;
    }

    @Override
    public ItemsPedido buscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ItemsPedido> listado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Producto buscarProducto(int id){
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

    public ItemsPedido agregado() {
        ItemsPedido c =null;
        try {            
            String sql = "SELECT * FROM item ORDER BY id DESC LIMIT 1";
                    
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while(rs.next()){
                c = new ItemsPedido();           
                c.setId(rs.getString(1));
                c.setProducto(buscarProducto(rs.getInt(3)));
                c.setCantidad(rs.getInt(4));
            }                 
        }catch (SQLException e){
            System.out.println("error: "+e);
        } 
        return c;
    }
    
}
