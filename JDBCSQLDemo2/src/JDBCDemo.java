import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anime",
                    "root","");
            Statement s = con.createStatement();
            System.out.println("Connection establish Successfully!");
            s.executeUpdate("INSERT INTO AOT(Name,Age,Titan,Status)VALUES('Eren',19,'Founding Titan','Dead');");
            System.out.println("Update executed Successfully!");
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    }