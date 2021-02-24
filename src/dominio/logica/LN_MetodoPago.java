package dominio.logica;

import dominio.MetodoPago;
import java.util.ArrayList;
import java.util.List;

public class LN_MetodoPago extends LN<MetodoPago>{

    @Override
    public void crear(MetodoPago obj) {
        super.db.getMetodoPagoDao().crear(obj);
    }

    @Override
    public void eliminar(MetodoPago obj) {
        super.db.getMetodoPagoDao().eliminar(obj);
    }

    @Override
    public void actualizar(MetodoPago obj) {
        super.db.getMetodoPagoDao().actualizar(obj);
    }

    @Override
    public MetodoPago buscar(int id) {
        return super.db.getMetodoPagoDao().buscar(id);
    }

    @Override
    public MetodoPago buscar(String nombre) {
        return super.db.getMetodoPagoDao().buscar(nombre);
    }

    @Override
    public ArrayList<MetodoPago> listado() {
        return super.db.getMetodoPagoDao().listado();
    }
    
}
