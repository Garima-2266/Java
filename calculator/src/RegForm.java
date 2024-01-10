import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;

class RegForm extends JFrame implements ActionListener{
    
    JLabel l1,l2,l3,l4,dob,l5;
    JTextArea ta,tb;
    JRadioButton b1,b2;
    JComboBox cb,day,month,year;
    JCheckBox c1;
    JButton b3;
//  JComboBox cb;
  JTextField t1,t2;
  Container c;
  public RegForm()
  {
      setSize(700,700);
      setTitle("Registration form");
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      c=this.getContentPane();
      c.setLayout(null);
      c.setBackground(Color.GREEN);
      
      l1 = new JLabel("Name:");
      l1.setBounds(20, 50, 80, 30);
      c.add(l1);

        t1 = new JTextField();
        t1.setBounds(100, 50, 80, 30);
        c.add(t1);
        
        l2 = new JLabel("Mobile No:");
        l2.setBounds(20, 90, 80, 30);
        c.add(l2);

        t2 = new JTextField();
        t2.setBounds(100, 90, 80, 30);
        c.add(t2);
        
        l3=new JLabel("Gender:");
        l3.setBounds(20,150,80,30);
        c.add(l3);
        
        b1=new JRadioButton("Male");
//        b1.setSelected(true);
        b2=new JRadioButton("Female");
        b1.setBounds(100,150,80,30);
        b2.setBounds(200,150,80,30);
        c.add(b1);
        c.add(b2);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
       
       
//        String Country[]={"Nepal","India","Japan"};
//        cb=new JComboBox(Country);
//        cb.setBounds(20,200,150,30);
//        c.add(cb);
        
        dob=new JLabel("DOB:");
        dob.setBounds(20,200,80,30);
        c.add(dob);
        
        String days[]={"1","2","3","4","5"};
                String months[]={"jan","feb","march"};
                        String years[]={"2001","2002","2003"};
                        
         day =new JComboBox(days);    
         day.setBounds(100,200,50,30);
         c.add(day);
         
         month=new JComboBox(months);
         month.setBounds(150,200,50,30);
         c.add(month);
        
         year=new JComboBox(years);
         year.setBounds(200,200,50,30);
         c.add(year);
       
         
        l4=new JLabel("Address:");
        l4.setBounds(20,250,80,30);
        c.add(l4);
        
         ta=new JTextArea();
         ta.setBounds(100,250,80,30);
         c.add(ta);
         ta.setLineWrap(true);
         
         c1=new JCheckBox("I accept the term and condition");
         c1.setBounds(20,300,200,30);
         c.add(c1);
         
        b3 = new JButton("Submit");
        b3.setBounds(20, 400, 80, 30);
        c.add(b3);
//        b3.addActionListener(this);
        
        tb=new JTextArea();
         tb.setBounds(350,200,300,300);
         c.add(tb);
         tb.setLineWrap(true);
         
        l4=new JLabel();
        l4.setBounds(20,550,200,30);
        c.add(l4);
        
        
        b3.addActionListener(this);
        
        setVisible(true);
  }
  public void actionPerformed(ActionEvent e){
      if(c1.isSelected())
      {
          l4.setText("Registration successful!");
          String name=t1.getText();
          String mobile=t2.getText();
          String gen="Female";
          if(b1.isSelected())
              gen="Male";
          
          String dob=day.getSelectedItem()+"-"+month.getSelectedItem()+"-"+year.getSelectedItem();
          String address=ta.getText();
          
          tb.setText("Name="+name+"\n"+"mobile="+mobile+"\nGender="+gen+"\nDOB="+dob+"\nAddress="+address);
          
      }
      else{
          l4.setText("Please accept terms & condition.");
      }
  }
  public static void main(String[] args)
  {
      new RegForm();
  }
}