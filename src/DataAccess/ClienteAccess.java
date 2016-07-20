/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Entidades.Cliente;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClienteAccess {
    
    String connectionString=
                " jdbc:sqlserver: (localhost);" +
            
                " databaseName = videoclub_db;" +
                "username=sa;"
                +"Password= Laspelotas9n;";
    
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    CallableStatement proc= null;
    boolean exito;
    public boolean ClienteInsertar(Cliente cliente)
    {
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionString);
            proc = con .prepareCall("exec proc ClienteInsertar (?,?,?,?,?,?)");
            proc.setString(1, cliente.getNombre());
            proc.setString(2, cliente.getApellidos());
            proc.setString(3, cliente.getCedula());
            proc.setString(4, cliente.getEmail());
            proc.setString(5, cliente.getTelefono());
            proc.setString(6, cliente.getDireccion());
            exito = proc.execute();
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    
    
    
}
