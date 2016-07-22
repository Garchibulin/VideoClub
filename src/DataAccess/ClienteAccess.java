/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Entidades.Cliente;
import java.sql.*;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

public class ClienteAccess {

   
    String connectionString
            = "jdbc:sqlserver://localhost:1433;"
            + " databaseName = videoclub_db;"
            + "username=sa;"
            + "Password= Laspelotas9n;";

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    CallableStatement proc = null;
    boolean exito;
    StoredProcedureQuery sp = null;
    public boolean ClienteInsertar(Cliente cliente) {  
        try {
            
             
        sp.setParameter("Nombre", cliente.getNombre());
        sp.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
        sp.setParameter("Apellidos", cliente.getApellidos());
        sp.registerStoredProcedureParameter("Apellidos", String.class, ParameterMode.IN);
        sp.setParameter("Cedula", cliente.getCedula());
        sp.registerStoredProcedureParameter("Cedula", String.class, ParameterMode.IN);
        sp.setParameter("Email",cliente.getEmail());
        sp.registerStoredProcedureParameter("Email", String.class, ParameterMode.IN);
        sp.setParameter("Telefono", cliente.getTelefono());
        sp.registerStoredProcedureParameter("Telefono", String.class, ParameterMode.IN);
        sp.setParameter("Direccion", cliente.getDireccion());
        sp.registerStoredProcedureParameter("Direccion", String.class, ParameterMode.IN);
        
        sp.registerStoredProcedureParameter("Id", int.class, ParameterMode.OUT);
        boolean affectedRows=sp.execute();
        
        System.out.println(affectedRows);
        return true;    
        }
        catch(Exception e)
        {
            e.printStackTrace();
        return false;
        }
        
        
    }

}
