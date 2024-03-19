package A67.Lab.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author phurpawangchuk
 * @contact phurpa.wangchuk@miu.edu
 * @year 2024-19-03
 */
public class DBConnection {
    private static final String USERNAME="root";
    private static final String PASSWORD="Root@123";
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";

    //Singleton object
    private static DBConnection instance = null;

    //COnnection object
    private Connection connection;

    private DBConnection() {
       try{
           connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
       }catch (Exception e){
           System.out.println("Error:"+e.getMessage());
       }
        System.out.println("Connected");
    }

    public static DBConnection getInstance() {
        if (instance== null)
            instance = new DBConnection();
        return instance;
    }

    public Connection getConnection(){
        return connection;

    }
}
