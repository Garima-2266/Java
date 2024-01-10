import java.sql.*;
import java.sql.DriverManager;

public class JDBCExample{
public static void main(String[] args){
try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
    System.out.println("Connection Created");//sout tab
//    String qry = "Create table user(id int (15) primary key auto_increment, fname varchar(25) not null, lname varchar(20)) ";
//    Statement st=con.createStatement();
//    st.execute(qry);
//    System.out.println("Table created successfully");
//    String qry="insert into user (fname,lname) values('Garima','Kathayat')";
    Statement st=con.createStatement();
//    int i=st.executeUpdate(qry);
//    String q="insert into user(fname,lname) values(?,?)";
//    PreparedStatement pst=con.prepareStatement(q);
//    pst.setString(1, "ABC");
//    pst.setString(2,"BBC");
//    pst.executeUpdate();
//    System.out.println(i+"row inserted successfully");

    String qr="Select *from user";
    ResultSet rs=st.executeQuery(qr);
    while(rs.next()){
    System.out.println(rs.getInt(1)+"\t");
    System.out.println(rs.getString("fname")+"\t");
    System.out.println(rs.getString(3));
}
}
catch(Exception e){
    System.out.println(e.toString());
}
}
}