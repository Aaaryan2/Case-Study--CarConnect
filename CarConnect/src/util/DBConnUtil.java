package util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnUtil {
	
    public static Connection getConnection() throws SQLException, FileNotFoundException, IOException, ClassNotFoundException 
    {
    	
    	Connection con=null;
            

                try 
                {
                   Class.forName("com.mysql.cj.jdbc.Driver");
                  //  System.out.println("Driver Load.......");
                
            
                   con= DriverManager.getConnection("jdbc:mysql://localhost:3306/carconnectdb","root","Agupta@4201#");
            
            // Establish the connection
            return con;
            
                
        } catch (Exception e) {
            // Handle exceptions related to driver loading or connection establishment
            //throw new SQLException("Error establishing database connection: " + e.getMessage(), e);
              System.out.println();
        }
                return con;
    }

}
