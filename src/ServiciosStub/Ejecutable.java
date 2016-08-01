/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosStub;

import DataAccess.ClienteAccess;
import Entidades.Cliente;
import java.sql.SQLException;

/**
 *
 * @author Simon
 */
public class Ejecutable {

    public static void main(String args[]) throws SQLException {
        
        Cliente cliente;
        cliente = new Cliente();
        
        cliente.setNombre("Gabbito");
        cliente.setApellidos("Garchitrue");
        cliente.setEmail("correo@servidor.com");
        cliente.setTelefono("666-666");
        cliente.setCedula("00-000-000-0");
        cliente.setDireccion("Inda Haus");
        
        ClienteAccess acceso;
        acceso = new ClienteAccess();
        boolean ClienteInsertar = acceso.ClienteInsertar(cliente);
        
        System.out.println(ClienteInsertar);
        System.out.println(cliente.getIdCliente());


    }

    
}
