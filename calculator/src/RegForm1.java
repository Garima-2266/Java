import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class Form extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4,l5,l6,db;
    JTextField t1,t2;
    JRadioButton b1 ,b2,b3;
    JButton b4;
    JComboBox day,month,year,cb;
    JTextArea ta,ta1;
    JCheckBox c1;
    Container c;
    public Form()
           
    {
       
     setSize(700,700);
     setTitle("Registration Form");
     setLocationRelativeTo(null);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     c = this.getContentPane();
     c.setLayout(null);
     c.setBackground(Color.lightGray);
     
     l1 = new JLabel("Name:");
        l1.setBounds(20,50,80,30);
        c.add(l1);
       
        t1 = new JTextField();
        t1.setBounds(100,50, 80,30);
        c.add(t1);
       
        l2 = new JLabel("Phone Number:");
        l2.setBounds(20,90,100,30);
        c.add(l2);
       
        t2 = new JTextField();
        t2.setBounds(130,90, 80,30);
        c.add(t2);
       
        l3 = new JLabel("Gender:");
        l3.setBounds(20,150,80,30);
        c.add(l3);

       
        b1 = new JRadioButton("Male");
        b1.setBounds(100,150,80,30);
        c.add(b1);
      //  b1.setSelected(true);
       
        b2 = new JRadioButton("Female");
        b2.setBounds(200,150,80,30);
        c.add(b2);
        //b2.setSelected(true);
       
         b3 = new JRadioButton("Others");
        b3.setBounds(300,150,80,30);
     
        c.add(b3);
       
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);
       
        db = new JLabel("DOB:");
        db.setBounds(20,200,80,30);
        c.add(db);
       
        String days[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"};
        String months[]={"Jan","Feb","March","April","May","Jun","JUL","AUG","SEP","OCT","NOV","DEC"};
        String years[]={"1999","2000","2001","2002","2003"};
       
        day = new JComboBox(days);
        day.setBounds(100,200,50,30);
        c.add(day);
       
       
        month = new JComboBox(months);
        month.setBounds(150,200,50,30);
        c.add(month);

       
        year = new JComboBox(years);
        year.setBounds(200,200,80,30);
        c.add(year);
       
        l4 = new JLabel("Address:");
        l4.setBounds(20,250,80,30);
        c.add(l4);
       
       
       
        ta = new JTextArea();
        ta.setBounds(110, 250,150,100);
        c.add(ta);
        ta.setLineWrap(true);

       
        l5 = new JLabel("Country:");
        l5.setBounds(20,380,80,30);
        c.add(l5);
       
         String Country[] = {"Nepal", "India", "Japan","Turkey"};
     
         cb = new JComboBox(Country);
         cb.setBounds(110,380,150,30);
        c.add(cb);
       
       
         c1 = new JCheckBox("I accept all the terms and conditions");
         c1.setBounds(20,420,260,30);
         c.add(c1);
         
         b4 = new JButton("Submit");
         b4.setBounds(68,470,80,30);
         c.add(b4);
         
         
        ta1 = new JTextArea();
        ta1.setBounds(320, 250,350,400);
        c.add(ta1);
        ta1.setLineWrap(true);
       
        l6 = new JLabel();
        l6.setBounds(20,550,300,30);
        c.add(l6);
       
        b4.addActionListener(this);
        setVisible(true);
}
        private void writeToFile(String data) {
        String fileName = "registration_details.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
            writer.newLine();
            l6.setText("Registration Successful.Data saved to file: " + fileName);
        } catch (IOException e) {
            l6.setText("Error: Unable to save data to file.");
            e.printStackTrace();
        }
       
       
}

public void actionPerformed(ActionEvent e)
        {
    if(c1.isSelected())
  {
      l6.setText("Registration Sucessful");
      String name = t1.getText();
      String mobile = t2.getText();
      String gen = "Female";
      if(b1.isSelected())
      {
          gen="Male";
      }
      if(b3.isSelected())
      {
          gen="Others";
      }
     
      String dob = day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
      String address = ta.getText();
     
      ta1.setText("Name:"+name+"\n"+"Phone Number:"+mobile+"\n Gender:"+gen+"\n DOB:"+dob+"\nAddress:"+address);
 
      String dataToWrite = "Name: " + name + "\n" +
                    "Phone Number: " + mobile + "\n" +
                    "Gender: " + gen + "\n" +
                    "DOB: " + dob + "\n" +
                    "Address: " + address;
  writeToFile(dataToWrite);
        } else {
            l6.setText("Please accept Terms and Condition");
        }
   
    }
   
    public static void main(String[] args) {
        new Form();
    }
}