import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
public class Number_Guessing_Game extends JFrame {
    private JLabel teller; 
    private JLabel number;
    private JTextField type;
    private JLabel result; 
    private JButton button;


    Number_Guessing_Game() {
        setLayout(new FlowLayout());
                      
        teller = new JLabel("Type a Number between 1 and 10");
        add(teller); 
        
        button = new JButton("Guess!"); 
        add(button);
        
        type = new JTextField(3);
        add(type);
        
        number = new JLabel("");
        add(number);
                      
        result = new JLabel("");
        add(result);
                     
        event e = new event();
        button.addActionListener(e);
        
    }
    class event implements ActionListener{ 
      public void actionPerformed(ActionEvent e){
        Random r = new Random();          
        int a = r.nextInt(9)+1;
        run(a);       
      }
    }
    public void run(int a){           
        int b = 0; 
        b = Integer.parseInt(type.getText());    
        if (b > a){result.setText("Your number is higher, but you can try again");run(a);}
        if (b < a){result.setText("Your number is lower, but you can try again");run(a);}                       
        if (b == a){result.setText("You are correct"); number.setText("The number was " + a);}
      }
    public static void main(String args[]   )  {
        Number_Guessing_Game Aru = new Number_Guessing_Game();
        Aru.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Aru.setSize(300, 250);
        Aru.setVisible(true);
        Aru.setTitle("Number Guessing Game");
    }
}