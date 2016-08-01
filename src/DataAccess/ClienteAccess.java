/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Entidades.Cliente;
import java.sql.*;

public class ClienteAccess {

    String connectionString
            = "jdbc:sqlserver://localhost:1433;"
            + " databaseName = videoclub_db;"
            + "username=sa;"
            + "Password= Laspelotas9n;";

    Connection con = null;
   
    CallableStatement proc = null;
    boolean exito;
    PreparedStatement stmt;
    
    // StoredProcedureQuery sp = null;

    public boolean ClienteInsertar(Cliente cliente) throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionString);
             proc = con.prepareCall("{call dbo.ClienteInsertar (?,?,?,?,?,?)}");
             
            
            proc.setString(1, cliente.getNombre());
            //  stmt.set
          
            //  proc.registerStoredProcedureParameter("Nombre", String.class, ParameterMode.IN);
            proc.setString(2, cliente.getApellidos());
            //proc.registerStoredProcedureParameter("Apellidos", String.class, ParameterMode.IN);
            proc.setString(3, cliente.getCedula());
            //   proc.registerStoredProcedureParameter("Cedula", String.class, ParameterMode.IN);
            proc.setString(4, cliente.getEmail());
            //    proc.registerStoredProcedureParameter("Email", String.class, ParameterMode.IN);
            proc.setString(5, cliente.getTelefono());
            //    proc.registerStoredProcedureParameter("Telefono", String.class, ParameterMode.IN);
            proc.setString(6, cliente.getDireccion());
            //    proc.registerStoredProcedureParameter("Direccion", String.class, ParameterMode.IN);
           //   proc.registerOutParameter("Id", Types.INTEGER);
              
          
           
             ResultSet rs = proc.executeQuery();
             
            
                
           // Object obj=rs.getInt(1);
            
            
            
            System.out.println(cliente.getIdCliente());
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            con.close();
            e.getMessage();
            e.printStackTrace();

            return false;
        } finally {
            
            con.close();
            stmt.close();
            proc.close();
        }

    }

}
