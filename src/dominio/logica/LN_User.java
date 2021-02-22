package dominio.logica;

import dominio.Cliente;
import dominio.Personal;
import persistencia.DaoFactory;
import persistencia.DaoFactoryJDBC;

public class LN_User {
    DaoFactory db = new DaoFactoryJDBC();
    
    public Cliente logear(Cliente obj){
        return db.getClienteDao().logeo(obj.getCorreo(), obj.getContraseña());
    }
    public Personal logear(Personal obj){
        return db.getAdminDao().logeo(obj.getCorreo(), obj.getContraseña());
    }
}
