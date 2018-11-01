package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jazzper
 */
public class JdbcConnection {
    
    private static final String url = "jdbc:postgresql:BAZA_PRODUKTOW";
    private static final String user = "postgres";
    private static final String password = "postgres";
    
    public static void main(String[] args) {
            postgreSqlConnection();
    }
    
    public static Connection postgreSqlConnection(){
        try {
            Class.forName("org.postgresql.Driver");
	} catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver? " + "Include in your library path!");
            e.printStackTrace();
            
}
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully");
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;

    }
    
//    public static class DbAccess {
//    
//}
    
}


    

