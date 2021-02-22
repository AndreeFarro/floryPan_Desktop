package dominio;

import java.util.ArrayList;

public class Personal extends Usuario{
    private Tipo tipo;
    private Cargo cargo;
    private ArrayList<Categoria> catalogo = new ArrayList();
    
    public Personal(){}
    public Personal(String id, String nombre, String apellido, String correo, String contraseña, int numMovil,Tipo tipo, Cargo cargo) {
        super(id,nombre, apellido, correo, contraseña, numMovil);
        this.tipo = tipo;
        this.cargo = cargo;
    }
    
    public void agregarCategoria(Categoria c){
        catalogo.add(c);
    }
    public void quitarCategoria(Categoria c){
        catalogo.remove(c);
    }
    public Categoria buscarCategoria(String id){
        for(Categoria c: catalogo){
            if (c.getId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public ArrayList<Categoria> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Categoria> catalogo) {
        this.catalogo = catalogo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
    
}
