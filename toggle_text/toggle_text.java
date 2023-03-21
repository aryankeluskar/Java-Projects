import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class toggle_text extends JFrame
{
    private JLabel label;
    private JLabel label1;
    private JButton button;
    private JButton button1;
    private int a = 0;
    private int b = 0;
   toggle_text() {
        setLayout(new FlowLayout());
        
        button = new JButton("HELLO");
        add(button);
        
        label = new JLabel("");
        add(label);
        
        label1 = new JLabel("");
        add(label1);
        
        button1 = new JButton("Hi");
        add(button1);
        
        event e = new event();
        button.addActionListener(e);
        
        event1 e1 = new event1();
        button1.addActionListener(e1);
           }
    public class event implements ActionListener{ 
           public void actionPerformed(ActionEvent e){ 
           if(a == 0){label.setText("Hi!"); a = 1;} 
            else if(a == 1){ label.setText(""); a = 0;}
        }
    }    
    public class event1 implements ActionListener{
            public void actionPerformed(ActionEvent e1){ 
            if(b == 0){label1.setText("Hello!"); b = 1;} 
            else if(b == 1){ label1.setText(""); b = 0;}
        }
    }
    public static void main(String args[])
    {
        toggle_text gui = new toggle_text();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setTitle("Hello");
        gui.setSize(300, 150);
    }
}
