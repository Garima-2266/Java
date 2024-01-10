
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MovieDb implements ActionListener{
    JTextField t1,t2,t3,t4;
    JLabel l1,l2,l3,l4;
    JButton b1;
    public MovieDb(){
        JFrame jf=new JFrame("Movie Rental System");
       
        l1=new JLabel("Title");
        l2=new JLabel("Genre");
        l3=new JLabel("Lancuage");
        l4=new JLabel("Length");
        
        t1=new JTextField(10);
        t2=new JTextField(10);
        t3=new JTextField(10);
        t4=new JTextField(10);
       
        b1=new JButton("SUBMIT");
        jf.add(l1);
        jf.add(t1);
        jf.add(l2);
        jf.add(t2);
        jf.add(l3);
        jf.add(t3);
        jf.add(l4);
        jf.add(t4);
        jf.add(b1);
        
        jf.setSize(500,700);
        jf.setLayout(new FlowLayout());
        b1.addActionListener(this);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        public void actionPerformed(ActionEvent ae){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/movie","root","");
                System.out.println("Database connected successfully");
                String sql="insert into movies(Title,Genre,Language,Length) Values(?,?,?,?)";
                PreparedStatement ps=conn.prepareStatement(sql);
               
                ps.setString(1, t1.getText());
                ps.setString(2, t2.getText());
                ps.setString(3, t3.getText());
                ps.setInt(4, Integer.parseInt(t4.getText()));
                ps.executeUpdate();
                conn.close();
                System.out.println("Inserted successfully");
            }
            catch(Exception e){
                System.out.println(e);
            }
     
    }
    public static void main(String[]args){
        new MovieDb();
         
    }

    
}