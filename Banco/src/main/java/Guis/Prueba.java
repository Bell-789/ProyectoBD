/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guis;

import Dominio.Conexion;

/**
 *
 * @author Bell
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion c = new Conexion();
        c.conexion();
        Inicio in = new Inicio();
        in.setVisible(true);
    }
    
}
