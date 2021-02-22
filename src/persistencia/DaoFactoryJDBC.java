package persistencia;

public class DaoFactoryJDBC implements DaoFactory{
    @Override
    public ClienteDao getClienteDao(){
        return new ClienteDao();
    }

    @Override
    public AdminDao getAdminDao() {
       return new AdminDao();
    }

    @Override
    public CategoriaDao getCategoriaDao() {
        return new CategoriaDao();
    }
    
    @Override
    public ProductoDao getProductoDao() {
        return new ProductoDao();
    }
    
    @Override
    public ItemDao getItemDao(){
        return new ItemDao();
    }
    
    @Override
    public CarritoDao getCarrito(){
        return new CarritoDao();
    }
    
    @Override
    public MetodoPagoDao getMetodoPagoDao(){
        return new MetodoPagoDao();
    }

    @Override
    public PedidoDao getPedidoDao() {
        return new PedidoDao();
    }
    
 
}
