package persistencia;

import dominio.Carrito;
import dominio.ItemsPedido;
import dominio.Producto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarritoDao extends Dao<Carrito>{

    @Override
    public void crear(Carrito obj) {
        try {
            for(ItemsPedido item: obj.getListaItems()){
                String sql = "insert into carrito values("+obj.getId()+",?)";
                PreparedStatement statement = this.connect.prepareStatement(sql);
                statement.setString(1,item.getId());      
                statement.execute();
            }
        }catch (SQLException e){
            System.out.println("error: "+e);
        }
    }

    @Override
    public void eliminar(Carrito obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void vaciarCarrito(Carrito obj){
        try{
            String sql = "delete from carrito where idCliente = "+obj.getId();
            PreparedStatement statement = this.connect.prepareStatement(sql);
            statement.execute();
        }catch (NumberFormatException | SQLException e){
        }
    }
    
    public void eliminarItems(Carrito obj) {
        try{
            String sql = "select * from carrito where idCliente="+obj.getId();
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();            
            while(rs.next()){
                eliminarItem(rs.getInt(1));
            }
        }catch (NumberFormatException | SQLException e){
        }
    }
    public void eliminarItem(int id) {
        try{
            String sql = "delete from item where id = "+id;
            PreparedStatement statement = this.connect.prepareStatement(sql);
            statement.execute();
        }catch (NumberFormatException | SQLException e){
        }
    }

    
    @Override
    public void actualizar(Carrito obj) {
        try {
            String sql1 = "delete from carrito where idCliente ="+obj.getId();
            PreparedStatement st = this.connect.prepareStatement(sql1);
            st.execute();
            for(ItemsPedido item: obj.getListaItems()){
                String sql = "insert into carrito (idCliente,idItem) values(?,?)";
                PreparedStatement statement = this.connect.prepareStatement(sql);
                statement.setInt(1,obj.getId());     
                statement.setInt(2,Integer.valueOf(item.getId()));      
                statement.execute();
            }
        }catch (SQLException e){
            System.out.println("error2: "+e);
        }
    }

    @Override
    public Carrito buscar(int id) {
        Carrito c = new Carrito();      
        c.setId(id);
        try {
            String sql = "select * from carrito where idCliente="+id;
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                ItemsPedido item = buscarItem(rs.getInt(2));
                c.agregarItem(item);
            }
   
        }catch (SQLException e){
        }         
        return c;          
    }

    @Override
    public Carrito buscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Carrito> listado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ItemsPedido buscarItem(int id) {
        ItemsPedido c =null;
        try {
            String sql = "select * from item where id="+id;
        
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
}
