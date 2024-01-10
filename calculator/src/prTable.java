
import javax.swing.JFrame;

public class prTable{
    public static main (String[] args){
        String [] [] data ={{"1","Garima","23"},{"2","Kathayat","20"}};"
        String[] colname={"Roll","name","Age"};
        JTable tab=new JTable (data,colname);
        JFrame jf=new JFrame("TableDemo");
        jf.setSize(500,500);
        jf.add(new JScrollPane (tab));
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jf.setLayout(null);
        jf.setVisible(true);
    }
    }
}