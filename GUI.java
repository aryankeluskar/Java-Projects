import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class GUI extends JFrame{
    JLabel label;
    JButton button;
    JTextField textfield;
    JTextArea textarea;
    JPasswordField password;
    JCheckBox checkbox;
    JRadioButton radiobutton;
    JComboBox combobox;
    JFileChooser filechooser;
    JButton filec;
    JButton sc;
    public GUI(){
        setLayout(new FlowLayout());
        label = new JLabel("This is a label");
        add(label);
        button = new JButton("This is a Button");
        add(button);
        textfield = new JTextField(15);
        add(textfield);
        password = new JPasswordField(20);
        add(password);
        checkbox = new JCheckBox("A");
        add(checkbox);
        radiobutton = new JRadioButton("B");
        add(radiobutton);
        String schools[] = {"The HPSB","VIBGYOR HIGH","Sri Venkateshwara International School","Dombivli International School"};
        combobox = new JComboBox(schools);
        add(combobox);
        sc = new JButton("Open");
        add(sc);
        open o = new open();
        sc.addActionListener(o);
        filechooser = new JFileChooser();
        add(filechooser);
         JFileChooser fc=new JFileChooser();    
         int i=fc.showOpenDialog(this);    
     if(i==JFileChooser.APPROVE_OPTION){    
        File f=fc.getSelectedFile();    
        String filepath=f.getPath();    
        try{  
        BufferedReader br=new BufferedReader(new FileReader(filepath));    
        String s1="",s2="";                         
        while((s1=br.readLine())!=null){    
        s2+=s1+"\n";    
        }    
        label.setText(s2);    
        br.close();    
        }catch (Exception ex) {ex.printStackTrace();  }           
     }
    }
    class open implements ActionListener{
       public void actionPerformed(ActionEvent o){
        GUI_2 win = new GUI_2();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(100, 100);
        win.setVisible(true);
        win.setTitle("Second Window");
       }
    }
   
   public static void main(String args[]){
        GUI win = new GUI();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(600, 600);
        win.setVisible(true);
        win.setTitle("Aryan Rocks, A.F.O.G.A is the best!!");
   }
}