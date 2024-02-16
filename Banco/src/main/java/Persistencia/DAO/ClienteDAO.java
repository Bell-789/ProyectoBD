/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia.DAO;

import Dominio.Cliente;
import Dominio.Domicilio;
import Persistencia.DTO.ClienteNewDTO;
import Persistencia.DTO.DomicilioNewDTO;
import Persistencia.IConexionBD;
import Persistencia.Excepciones.Excepciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Bell
 */
public class ClienteDAO implements IClienteDAO {
    
    IConexionBD conexionBD;
    private static final Logger LOG = Logger.getLogger(ClienteDAO.class.getName());

    public ClienteDAO(IConexionBD conexionBD) {
        this.conexionBD = conexionBD;
    }
 
    
    public Cliente agregarCliente(ClienteNewDTO cliente) throws Excepciones {
String sentenciaSQL = "Insert into Cliente (nombre, apellidoP, apellidoM, fechaNacimiento, usuario, contrasena) " +
                      "VALUES (?, ?, ?, ?, ?, ?)";
        try {
            Connection conexion = this.conexionBD.crearConexion();
            PreparedStatement comandoSQL = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);

            comandoSQL.setString(1, cliente.getNombre());
            comandoSQL.setString(2, cliente.getApellidoP());
            comandoSQL.setString(3, cliente.getApellidoM());
            comandoSQL.setDate(4, cliente.getFechaNacimiento());
            comandoSQL.setString(5, cliente.getUsuario());
            comandoSQL.setString(6, cliente.getContrasena());
            int registrosModificados = comandoSQL.executeUpdate();
            LOG.log(Level.INFO, "Se agregaron con éxito {0} ", registrosModificados);
            ResultSet registroGenerado = comandoSQL.getGeneratedKeys();
            registroGenerado.next();

            Cliente clienteNuevo = new Cliente(registroGenerado.getInt(1), cliente.getNombre(), cliente.getApellidoP(), cliente.getApellidoM(),
                    cliente.getFechaNacimiento(),cliente.getUsuario(),cliente.getContrasena());

            return clienteNuevo;
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "No se agregó con éxito el cliente", e);
            throw new Excepciones("No se pudo guardar el cliente ", e);
        }

    }

   
    public Domicilio agregarDomicilio(DomicilioNewDTO direccion) throws Excepciones {
        String sentenciaSQL = "Insert Into Domicilio (colonia, calle, num) VALUES (?, ?, ?)";
        try {
            Connection conexion = this.conexionBD.crearConexion();
            PreparedStatement comandoSQL = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);
            comandoSQL.setString(2, direccion.getColonia());
            comandoSQL.setString(1, direccion.getCalle());
            comandoSQL.setString(3, direccion.getNum());
            

            int registrosModificados = comandoSQL.executeUpdate();

            LOG.log(Level.INFO, "Se actualizaron con éxito {0} registros", registrosModificados);
            ResultSet registroGenerado = comandoSQL.getGeneratedKeys();

            //nos posicionamos en el primer registro o en el siguiente disponible. 
            registroGenerado.next();

            return new Domicilio(registroGenerado.getInt(1), direccion.getCalle(), direccion.getColonia(), direccion.getNum(), registroGenerado.getInt(1));
        } catch (Exception e) {
            LOG.log(Level.SEVERE, "No se pudo agregar la direccion", e);
            throw new Excepciones("No se pudo actualizar el cliente ", e);
        }
    }

}


