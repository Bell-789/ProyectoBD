/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia.DAO;
import Dominio.Cliente;
import Dominio.Domicilio;
import Persistencia.DTO.ClienteNewDTO;
import Persistencia.DTO.DomicilioNewDTO;
import Persistencia.Excepciones.Excepciones;

/**
 *
 * @author Bell
 */
public interface  IClienteDAO {
     public Cliente agregarCliente(ClienteNewDTO cliente) throws Excepciones;

            public Domicilio agregarDomicilio(DomicilioNewDTO direccion) throws Excepciones;

}
