package persistencia;

import dominio.MetodoPago;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetodoPagoDao extends Dao<MetodoPago> {

    @Override
    public void crear(MetodoPago obj) {
        try {
            String sql = "insert into metodopago values(default,?,?)";
            PreparedStatement statement = this.connect.prepareStatement(sql);
            statement.setString(1,obj.getMetodo());       
            statement.setString(2,obj.getCodigo());    
            statement.execute();
        }catch (SQLException e){
            System.out.println("error: "+e);
        }
    }

    @Override
    public void eliminar(MetodoPago obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(MetodoPago obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MetodoPago buscar(int id) {
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

    @Override
    public MetodoPago buscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MetodoPago> listado() {
        List<MetodoPago> listaMetodo = new ArrayList();
        try {
            String sql = "select * from metodopago";
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                MetodoPago c = new MetodoPago();
                c.setId(rs.getInt(1));
                c.setMetodo(rs.getString(2));               
                c.setCodigo(rs.getString(3));
                listaMetodo.add(c);
            }
   
        }catch (SQLException e){
        } 
        return listaMetodo;
    }
    
}
