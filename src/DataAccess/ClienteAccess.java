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
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class ClienteAccess {
     @PersistenceContext
EntityManager em;
    
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
            
                    em.persist(cliente);

            
        } catch (Exception e) {
        }
        return true;
    }
    
    
    
    
}
