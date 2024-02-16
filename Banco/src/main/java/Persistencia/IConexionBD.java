
package Persistencia;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Bell
 */
public interface IConexionBD {
       public Connection crearConexion() throws SQLException;
}
