import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator1 extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;
    Container c;
    
    public Calculator1(){
        setTitle("Calculator");
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=this.getContentPane();
        c.setLayout(null);
        l1=new JLabel("First number:");
        l1.setBounds(20,50,80,30);
        c.add(l1);
        
        t1=new JTextField();
        t1.setBounds(100,50,80,30);
        c.add(t1);
        
        l2=new JLabel("Second number:");
        l2.setBounds(20,90,100,30);
        c.add(l2);
        
        t2=new JTextField();
        t2.setBounds(120,90,80,30);
        c.add(t2);
       
      b1=new JButton("Add");
      b1.setBounds(5,150,80,30);
      c.add(b1);
      b1.addActionListener(this);
      
      l3=new JLabel();
      l3.setBounds(20,300,60,30);
      c.add(l3);
      
      b2=new JButton("Sub");
      b2.setBounds(90,150,90,30);
      c.add(b2);
      b2.addActionListener(this);
      
      l4=new JLabel();
      l4.setBounds(20,300,60,30);
      c.add(l4);
      
      b3=new JButton("Mul");
      b3.setBounds(185,150,90,30);
      c.add(b3);
      b3.addActionListener(this);
      
      l5=new JLabel();
      l5.setBounds(20,300,60,30);
      c.add(l5);
      
      b4=new JButton("Div");
      b4.setBounds(280,150,90,30);
      c.add(b4);
      b4.addActionListener(this);
      
      l6=new JLabel();
      l6.setBounds(20,300,60,30);
      c.add(l6);
      
      
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());
        int c=a+b;
        l3.setText("sum="+c);
        
        int c=a-b;
        l4.setText("Sub="+c);
        
        int c=a*b;
        l5.setText("Mul="+c);
    }
    public static void main(String[]args){
        new Calculator1();
    }
}