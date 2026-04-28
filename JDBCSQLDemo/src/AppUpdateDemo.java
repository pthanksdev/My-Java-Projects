import java.sql.*;

public class AppUpdateDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/niit";
        String username = "root";
        String passcode = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, passcode);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from library");
            System.out.println("Connection establish Successfully!");
            statement.executeUpdate("Update From library(BookID,Title,Author,Likes)VALUES(001,'Dawn of the nightwing children'" +
                    ",'VOVO',277)");
            System.out.println("Updated Multiple Records Successfully!");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}

