import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator2 extends JFrame implements ActionListener {
    JLabel l1 , l2, l3;
    JTextField t1, t2;
    JButton b1, b2, b3, b4, b5;
    Container c;

    public Calculator2() {
        setTitle("Calculator");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = this.getContentPane();
        c.setLayout(null);

        l1 = new JLabel("First number:");
        l1.setBounds(20, 50, 80, 30);
        c.add(l1);

        t1 = new JTextField();
        t1.setBounds(100, 50, 80, 30);
        c.add(t1);

        l2 = new JLabel("Second number:");
        l2.setBounds(20, 90, 100, 30);
        c.add(l2);

        t2 = new JTextField();
        t2.setBounds(120, 90, 80, 30);
        c.add(t2);

        b1 = new JButton("Add");
        b1.setBounds(5, 150, 80, 30);
        c.add(b1);
        b1.addActionListener(this);

        

        b2 = new JButton("Sub");
        b2.setBounds(90, 150, 90, 30);
        c.add(b2);
        b2.addActionListener(this);

//        l4 = new JLabel();
//        l4.setBounds(20, 230, 200, 30);
//        c.add(l4);

        b3 = new JButton("Mul");
        b3.setBounds(185, 150, 90, 30);
        c.add(b3);
        b3.addActionListener(this);

//        l5 = new JLabel();
//        l5.setBounds(20, 260, 200, 30);
//        c.add(l5);

        b4 = new JButton("Div");
        b4.setBounds(280, 150, 90, 30);
        c.add(b4);
        b4.addActionListener(this);

//        l6 = new JLabel();
//        l6.setBounds(20, 290, 200, 30);
//        c.add(l6);
//        
        b5 = new JButton("Reset");
        b5.setBounds(150, 180, 80, 30);
        c.add(b5);
        b5.addActionListener(this);

        l3 = new JLabel();
        l3.setBounds(20, 200, 200, 30);
        c.add(l3);
        setVisible(true); 
    }

    public void actionPerformed(ActionEvent e) {
       try{
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());

        if (e.getSource() == b1) {
            int result = a + b;
            l3.setText("Sum = " + result);
        } if (e.getSource() == b2) {
            int result = a - b;
            l3.setText("Subtraction = " + result);
        } if (e.getSource() == b3) {
            int result = a * b;
            l3.setText("Multiplication = " + result);
        }  if (e.getSource() == b4) {
//            if (b = 0) {
                double result = (double) a / b;
                l3.setText("Division = " + result);
            } 
             if(e.getSource()==b5){
               t1.setText(""); 
               t2.setText("");
               l3.setText("");
            }
         }
             catch(NumberFormatException e1)
                     {
                     l3.setText("Input integer only");
                     }
       catch(ArithmeticException e2){
           l3.setText("cannot divide by Zero");
//           e2.getMessage();
       }
        }
    public static void main(String[] args) {
         new Calculator2();
    }
}
