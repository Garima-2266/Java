import java.sql.*;
public class JDBC_Program{
    public static void main(String [] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/test","root","");
            Statement stmt= conn.createStatement();
            System.out.println("Connection Successful");
            String query="Create table reg(id int(20),name varchar(25),address varchar(25))";
            stmt.executeUpdate(query);
            System.out.println("Table created successfully");
            
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
}
    
}