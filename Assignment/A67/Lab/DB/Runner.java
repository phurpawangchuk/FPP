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
public class Runner {
    public static void main(String[] args) {
       // Connection connection = null;
        try{
            DBConnection dbConnection = DBConnection.getInstance();
            Connection connection = dbConnection.getConnection();
//            String jdbcUrl = "jdbc:mysql://localhost:3306/mydb";
//            String user = "root";
//            String password ="Root@123";

//            connection = DriverManager.getConnection(jdbcUrl, user, password);

            Statement st = connection.createStatement();
            String query = "SELECT * FROM `mytable`";
            ResultSet result = st.executeQuery(query);
            StringBuilder sb =  new StringBuilder();
            sb.append("ID\tName\n");
            while(result.next()){
                sb.append(result.getInt(1)+"\t"+result.getString(2)+"\n");
            }
            System.out.println(sb.toString());
            st.close();;
            connection.close();

        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
