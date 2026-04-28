import com.sun.jdi.StringReference;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/football";
        String username = "root";
        String passcode = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,passcode);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from player");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+
                        resultSet.getString(2)+" "+
                        resultSet.getString(3)+" "+
                        resultSet.getInt(4)+" "+
                        resultSet.getInt(5)+" "+
                        resultSet.getInt(6)+" "+
                        resultSet.getString(7)+" "+
                        resultSet.getInt(8)+" "+
                        resultSet.getString(9)+" "+
                        resultSet.getString(10));
            }
            connection.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
