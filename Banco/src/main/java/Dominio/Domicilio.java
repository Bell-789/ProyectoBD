
package Dominio;

/**
 *
 * @author Bell
 */
public class Domicilio {
    
    private int idDomicilio;
    private String colonia;
    private String calle;
    private String num;
    private int idCliente;

    
    // Constructor vacio
    public Domicilio() {
    }

    // Constructor con todos los campos

    public Domicilio(int idDomicilio, String colonia, String calle, String num, int idCliente) {
        this.idDomicilio = idDomicilio;
        this.colonia = colonia;
        this.calle = calle;
        this.num = num;
        this.idCliente = idCliente;
    }

    public Domicilio(String colonia, String calle, String num, int idCliente) {
        this.colonia = colonia;
        this.calle = calle;
        this.num = num;
        this.idCliente = idCliente;
    }

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
   
  
}
