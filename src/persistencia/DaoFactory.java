package persistencia;

public interface DaoFactory {
    public ClienteDao getClienteDao();
    public AdminDao getAdminDao();
    public CategoriaDao getCategoriaDao();
    public ProductoDao getProductoDao();
    public ItemDao getItemDao();
    public MetodoPagoDao getMetodoPagoDao();
    public CarritoDao getCarrito();
    public PedidoDao getPedidoDao();
}
