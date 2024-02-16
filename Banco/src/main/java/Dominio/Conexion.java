 package Dominio;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    String url = "jdbc:mysql://localhost:3306";
    String nombreBD = "Banco";
    String usuario = "root";
    String contra = "tomatin789";
    String driver = "com.mysql.jdbc.Driver";
    
    Connection conexion = null;
    public Connection conexion(){
        try {
            
            Class.forName(driver);
            conexion = DriverManager.getConnection(url+"/"+nombreBD, usuario, contra);
            
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Conexion Fallida");
        }
        return conexion;
    }
    
    public void desconectar(){
        try{
            if(conexion != null && !conexion.isClosed()){
                conexion.close();
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
    }
}
