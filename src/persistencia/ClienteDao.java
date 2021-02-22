package persistencia;

import dominio.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDao extends Dao<Cliente> implements ICliente{

    @Override
    public void crear(Cliente obj) {
        try {
            String sql = "insert into cliente values(default,?,?,?,?,?,?,?)";
            PreparedStatement statement = this.connect.prepareStatement(sql);
            statement.setString(1,obj.getNombre());
            statement.setString(2,obj.getApellido());
            statement.setString(3,obj.getContraseña());
            statement.setString(4,obj.getCorreo());
            statement.setString(5,String.valueOf(obj.getNumMovil()));
            statement.setString(6,obj.getDireccion());
            statement.setInt(7,obj.getDNI());
            statement.execute();
        }catch (SQLException e){
            System.out.println("error: "+e);
        }
    }

    @Override
    public void eliminar(Cliente obj) {
        try{
            String sql = "delete from cliente where id = ?";
            PreparedStatement statement = this.connect.prepareStatement(sql);
            statement.setInt(1,Integer.valueOf(obj.getId()));
            statement.execute();
        }catch (NumberFormatException | SQLException e){
        }
    }

    @Override
    public void actualizar(Cliente obj) {       
        try{
            String sql = "update cliente set nombre = ?,apellido=?,contraseña=?,correo =?,numero=?,direccion=?,dni=? where id = ?";
            PreparedStatement statement = this.connect.prepareStatement(sql);
            statement.setString(1,obj.getNombre());
            statement.setString(2,obj.getApellido());
            statement.setString(3,obj.getContraseña());
            statement.setString(4,obj.getCorreo());
            statement.setString(5,String.valueOf(obj.getNumMovil()));
            statement.setString(6,obj.getDireccion());
            statement.setInt(7,obj.getDNI());            
            
            statement.setInt(8,Integer.valueOf(obj.getId()));
            statement.execute();    
        }catch (NumberFormatException | SQLException e){
            
        } 
    }

    @Override
    public Cliente buscar(int id) {
        Cliente c =null;
        try {
            String sql = "select * from cliente where id="+id;
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                c = new Cliente();
                c.setId(rs.getString(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setContraseña(rs.getString(4));
                c.setCorreo(rs.getString(5));
                c.setNumMovil(rs.getInt(6));
                c.setDireccion(rs.getString(7));
                c.setDNI(rs.getInt(8));
            }                 
        }catch (SQLException e){
        } 
      return c;
    }
    
    @Override
    public Cliente buscar(String nombre) {
        Cliente c =null;
        try {
            String sql = "select * from cliente where nombre='"+nombre+"'";
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                c = new Cliente();
                c.setId(rs.getString(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setContraseña(rs.getString(4));
                c.setCorreo(rs.getString(5));
                c.setNumMovil(rs.getInt(6));
                c.setDireccion(rs.getString(7));
                c.setDNI(rs.getInt(8));
            }                 
        }catch (SQLException e){
        } 
      return c;
    }

    @Override
    public List<Cliente> listado() {
        List<Cliente> listaCliente = new ArrayList<>();
        try {
            String sql = "select * from cliente";
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                Cliente c = new Cliente();
                c.setId(rs.getString(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setContraseña(rs.getString(4));
                c.setCorreo(rs.getString(5));
                c.setNumMovil(rs.getInt(6));
                c.setDireccion(rs.getString(7));
                c.setDNI(rs.getInt(8));               
                listaCliente.add(c);
            }
   
        }catch (SQLException e){
        } 
        return listaCliente;
    }

    @Override
    public Cliente logeo(String Correo, String clave) {
        Cliente c =null;
        try {
            String sql = "select * from cliente where correo='"+Correo+"' and contraseña ='"+clave+"'";
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                c = new Cliente();
                c.setId(rs.getString(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setContraseña(rs.getString(4));
                c.setCorreo(rs.getString(5));
                c.setNumMovil(rs.getInt(6));
                c.setDireccion(rs.getString(7));
                c.setDNI(rs.getInt(8));
            }                 
        }catch (SQLException e){
        } 
      return c;
    }    
}

