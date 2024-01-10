
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class dialogEx extends JFrame{
    JButton b;
    Container c;  
    public dialogEx(){
        setTitle("Dialogbox Example");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=this.getContentPane();
        c.setLayout(new FlowLayout());
        b=new JButton("Submit");
        c.add(b);
        b.addActionListener(this);
        
        
        setVisible(true);
    }
        public static void main(String[] args){
                new dialogEx();
    }
        public void actionPerformed(ActionEvent e){
            String s=JOptionPane.showInputDialog("Enter you name");
            System.out.println("Name:"+s);
            JOptionPane.showMessageDialog(c,"Hello there","Information",JOptionPane.INFORMATION_MESSAGE);
//          Question,warning,message,error
            int a =JOptionPane.showConfirmDialog(c,"Do you wish to exit","Confirm",JOptionPane.YES_NO_CANCEL_OPTION);
            if (a==JOptionPane.YES_OPTION)
            {
                System.exit(1);
            }
            if (a==JOptionPane.NO_OPTION)
            {
                System.exit(1);
            }
            if (a==JOptionPane.CANCEL_OPTION)
            {
                System.exit(1);
            }
        }
}