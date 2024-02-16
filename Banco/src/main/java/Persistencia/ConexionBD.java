
package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bell
 */
public class ConexionBD  implements IConexionBD {
// atributos de la clase-objeto
    final private String url;
    final private String pelos;
    final private String contra;
    private static final Logger LOG = Logger.getLogger(ConexionBD.class.getName());
    
    
    public ConexionBD(String url, String pelos, String contra) {
        this.url = url;
            this.pelos = pelos;
            this.contra = contra;
    }

    @Override
    public Connection crearConexion() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
}
