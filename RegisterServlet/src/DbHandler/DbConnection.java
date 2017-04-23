package DbHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by User on 4/21/2017.
 */
public class DbConnection {

    public static Connection getConnection(){
        Connection con= null;

        try {


            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");
            if (con.equals(null)){
                System.out.println("Connection is null");
            }
        }

        catch (SQLException e) {
            e.printStackTrace();
        }

        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return con;
    }
}
