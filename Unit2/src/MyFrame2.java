import java.awt.Color;
import java.awt.Container;
import javax.swing.*;

class MyFrame2 extends JFrame {
    Container c;

    public MyFrame2() {
        setSize(500, 700);
        setLocationRelativeTo(null);
        setTitle("Garima");
        c = getContentPane();
        c.setBackground(Color.BLACK);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        new MyFrame2();
    }
}
