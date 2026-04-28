import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.sql.*;

public class App {
    public static void main(String[] args)throws Exception{
        String url="jdbc:mysql://localhost:3306/niit";
        String username = "root";
        String passcode = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,passcode);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from library");
            System.out.println("Connection establish Successfully!");
            String query = "INSERT INTO library(BookID,Title,Author,Likes)VALUES(?,?,?,?)";
                    //Adding 1st record
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,001);
            ps.setString(2,"Dawn of the nightwing children");
            ps.setString(3,"VIVI");
            ps.setInt(4,277);

            ps.addBatch();
            //Adding 2nd Record
            ps.setInt(1,002);
            ps.setString(2,"Enders game");
            ps.setString(3,"Orson Scott card");
            ps.setInt(4,64678);

            ps.addBatch();
            //Adding 3rd Record
            ps.setInt(1,003);
            ps.setString(2,"The Horizon");
            ps.setString(3,"Jh");
            ps.setInt(4,64678);

            ps.addBatch();
            //Adding 4th Record
            ps.setInt(1,004);
            ps.setString(2,"The Door");
            ps.setString(3,"Magda szabo");
            ps.setInt(4,64678);

         //   ps.addBatch();
            ps.executeBatch();
            System.out.println("Inserted Multiple Records Successfully!");
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
