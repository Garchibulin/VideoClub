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
                "jdbc:sqlserver://localhost:1433;"            
                +" databaseName = videoclub_db;" +
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
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            con = DriverManager.getConnection(connectionString);
            proc = con .prepareCall("exec proc ClienteInsertar (?,?,?,?,?,?)");
            
            // los parámetros se establecen de acuerdo al orden en el procedimiento
            //almacenado. También se tienen que registerOut antes que el 
            //procedimiento se ejecute
            proc.setString(1, cliente.getNombre());
            proc.registerOutParameter(1,Types.NVARCHAR);
            proc.setString(2, cliente.getApellidos());
            proc.registerOutParameter(2,Types.NVARCHAR);
            proc.setString(3, cliente.getCedula());
            proc.registerOutParameter(3,Types.NVARCHAR);
            proc.setString(4, cliente.getEmail());
            proc.registerOutParameter(4,Types.NVARCHAR);
            proc.setString(5, cliente.getTelefono());
            proc.registerOutParameter(5,Types.NVARCHAR);
            proc.setString(6, cliente.getDireccion());
            proc.registerOutParameter(6,Types.NVARCHAR);
            exito = proc.execute();
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ClienteAccess.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ClienteAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    
    
    
}
