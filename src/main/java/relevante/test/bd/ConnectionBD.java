package relevante.test.bd;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class ConnectionBD {
	private static DataSource dataSource;

    private ConnectionBD()
    {
        try 
        {
            Context ctx = new InitialContext();
            dataSource = (DataSource) ctx.lookup("jdbc/Relevante");
        } catch (NamingException ex) {
            Logger.getLogger(ConnectionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
    public static ConnectionBD createConexionBD()
    {
        return new ConnectionBD();
    }
   
    public static Connection getConexion() 
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException 
    {
        Connection connection = dataSource.getConnection();
        return connection;
    }
}
