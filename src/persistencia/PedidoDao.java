package persistencia;

import dominio.Cliente;
import dominio.ItemsPedido;
import dominio.MetodoPago;
import dominio.Pedido;
import dominio.Producto;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PedidoDao extends Dao<Pedido>{

    @Override
    public void crear(Pedido obj) {
    }
    
    public void crearPedido(Pedido obj,int id) {
        try {
            String sql = "insert into pedido (id,direccion,fecha,estado,idMetodoPago,idCliente) values(default,?,?,?,?,?)";
            PreparedStatement statement = this.connect.prepareStatement(sql);
            statement.setString(1,obj.getDireccion());          
            statement.setString(2,new SimpleDateFormat("yyyy-MM-dd").format(obj.getFecha())); 
            statement.setString(3,"PENDIENTE"); 
            statement.setInt(4,obj.getMetodoPago().getId()); 
            statement.setInt(5,id); 
            
            statement.execute();
        }catch (SQLException e){
            System.out.println("error: "+e);
        }
    }
    
    public List<ItemsPedido> buscarItems(Pedido obj) {
        
        List<ItemsPedido> listItem = new ArrayList();
        try {
            String sql = "select * from item where idPedido="+obj.getId();
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                ItemsPedido c = new ItemsPedido();           
                c.setId(rs.getString(1));
                c.setProducto(buscarProducto(rs.getInt(3)));
                c.setCantidad(rs.getInt(4));
                listItem.add(c);
            }
   
        }catch (SQLException e){
        } 
        return listItem;
    }
    
    public Producto buscarProducto(int id){
        System.out.println("buscando productos...");
        Producto p =null;
        try {
            String sql = "select * from producto where id="+id;
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                p = new Producto();                
                p.setId(rs.getString(1));
                System.out.println(rs.getDouble(3));
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
    public void eliminar(Pedido obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Pedido obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Pedido buscar(int id){
        Pedido c =null;
        try {
            String sql = "select * from pedido where id="+id;
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                c = new Pedido();
                c.setId(rs.getString(1));
                c.setDireccion(rs.getString(2));
                c.setFecha(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString(3)));
                c.setEstado(rs.getString(4));
                c.setMetodoPago(buscarMetodoPago(rs.getInt(5)));
            }                 
        }catch (SQLException|ParseException  e){
        } 
      return c;
    }
    
    public ArrayList<Pedido> buscar(Cliente cliente) {
        ArrayList<Pedido> listaPedidos = new ArrayList();        
        try {
            String sql = "select * from pedido where idCliente="+cliente.getId();
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                Pedido c = new Pedido();
                c.setId(rs.getString(1));
                c.setDireccion(rs.getString(2));
                c.setFecha(new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString(3)));
                c.setEstado(rs.getString(4));
                c.setMetodoPago(buscarMetodoPago(rs.getInt(5)));    
                
                String sql2 = "select * from item where idPedido="+c.getId();
                PreparedStatement st = this.connect.prepareStatement(sql2);
                ResultSet rs1 = st.executeQuery();

                while(rs1.next()){
                    ItemsPedido itm = new ItemsPedido();           
                    itm.setId(rs1.getString(1));
                    itm.setProducto(buscarProducto(rs1.getInt(3)));
                    System.out.println("item.... "+itm.getProducto().getNombre());
                    itm.setCantidad(rs1.getInt(4));
                    c.agregarItem(itm);
                }
                
                listaPedidos.add(c);
            }
   
        }catch (SQLException |ParseException  e){
        }
        return listaPedidos;  
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
    

    @Override
    public Pedido buscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Pedido> listado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public MetodoPago buscarMetodoPago(int id) {
        MetodoPago metodoPago =null;
        try {
            String sql = "select * from metodopago where id="+id;
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                metodoPago = new MetodoPago();
                metodoPago.setId(rs.getInt(1));
                metodoPago.setMetodo(rs.getString(2));  
                metodoPago.setCodigo(rs.getString(3));
            }                 
        }catch (SQLException e){
        } 
      return metodoPago;
    }
    
    public Pedido agregado() {
        Pedido c =null;
        try {            
            String sql = "SELECT * FROM pedido ORDER BY id DESC LIMIT 1";
                    
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();

            while(rs.next()){
                c = new Pedido();           
                c.setId(rs.getString(1));
            }                 
        }catch (SQLException e){
            System.out.println("error: "+e);
        } 
        return c;
    }
}
