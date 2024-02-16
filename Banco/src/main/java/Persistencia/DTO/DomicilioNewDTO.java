/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia.DTO;

/**
 *
 * @author Bell
 */
public class DomicilioNewDTO {
    
      private int idDomicilio;

    private String colonia;
    private String calle;
    private String numero;
    private int idCliente;

    public DomicilioNewDTO() {
    }

    public DomicilioNewDTO(int idDomicilio, String colonia, String calle, String numero, int idCliente) {
        this.idDomicilio = idDomicilio;
        this.colonia = colonia;
        this.calle = calle;
        this.numero = numero;
        this.idCliente = idCliente;
    }

    public DomicilioNewDTO(String colonia, String calle, String numero, int idCliente) {
        this.colonia = colonia;
        this.calle = calle;
        this.numero = numero;
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    
}
