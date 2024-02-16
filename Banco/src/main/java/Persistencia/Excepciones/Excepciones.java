/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia.Excepciones;

/**
 *
 * @author Bell
 */
public class Excepciones extends Exception{
    
     public Excepciones() {
    }

    public Excepciones(String message) {
        super(message);
    }

    public Excepciones(String message, Throwable cause) {
        super(message, cause);
    }

    public Excepciones(Throwable cause) {
        super(cause);
    }

    public Excepciones(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
     
}
