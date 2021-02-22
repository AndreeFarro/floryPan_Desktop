package dominio;

import java.util.ArrayList;
import java.util.Date;

public class Carrito {
    private int id;
    private Date fecha;
    private ArrayList<ItemsPedido> listaItems = new  ArrayList();

    public Carrito() {
    }
    
    public ItemsPedido buscar(int id){
        for (ItemsPedido i: listaItems) {
            if (i.getId().equals(String.valueOf(id))) {
                return i;
            }
        }
        return null;
    }

    public void agregarItem(ItemsPedido item){
        listaItems.add(item);
    }
    public void quitarItem(ItemsPedido item){
        listaItems.remove(item);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<ItemsPedido> getListaItems() {
        return listaItems;
    }

    public void setListaItems(ArrayList<ItemsPedido> listaItems) {
        this.listaItems = listaItems;
    }
    
    
    
    
}
