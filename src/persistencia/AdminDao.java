package persistencia;

import dominio.Cargo;
import dominio.Personal;
import dominio.Tipo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDao extends Dao<Personal> implements IAdmin{

    @Override
    public void crear(Personal obj) {
        
    }

    @Override
    public void eliminar(Personal obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Personal obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personal buscar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personal buscar(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Personal> listado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Personal logeo(String Correo, String clave) {
        Personal c =null;
        try {
            String sql = "select * from personal where correo='"+Correo+"' and contraseña ='"+clave+"'";
            PreparedStatement statement = this.connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            
            while(rs.next()){
                c = new Personal();
                c.setId(rs.getString(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setContraseña(rs.getString(4));
                c.setCorreo(rs.getString(5));
                c.setNumMovil(rs.getInt(6));
                c.setTipo(Tipo.valueOf(rs.getString(7)));
                c.setCargo(Cargo.valueOf(rs.getString(8)));
            }                 
        }catch (SQLException e){
        } 
      return c;
    }
    
}
