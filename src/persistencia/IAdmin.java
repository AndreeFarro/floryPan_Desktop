package persistencia;

import dominio.Personal;

public interface IAdmin {
    public Personal logeo(String Correo, String clave);
}
