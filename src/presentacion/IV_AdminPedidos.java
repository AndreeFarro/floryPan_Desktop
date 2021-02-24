package presentacion;

import dominio.ItemsPedido;
import dominio.Pedido;
import java.util.ArrayList;

public interface IV_AdminPedidos {
    public void setPresentador(P_AdminPedidos p);
    public void iniciar();
    public void close();
    public void setPedidos(ArrayList<Pedido> pedidos);
    public void setItems(ArrayList<ItemsPedido> items);
    public int getIdPedido();
}
