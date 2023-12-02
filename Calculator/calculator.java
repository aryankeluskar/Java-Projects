/**
 * By Aryan K
 * Version 1.0
 * Following functions must be there :- sin, tan, cos, hypo, ln, log, 90% calculations which can be done on a fx-991es-plus									 
 */ 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator extends JFrame { 
    JButton sub, div, mul, add; 
    JTextField no1, no2;
    JLabel res, no3, no4;
        public Calculator()    {
        setLayout(new GridBagLayout());  
        GridBagConstraints a = new GridBagConstraints();
        
        no1 = new JTextField(10);
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 1;
        a.gridy = 1;
        a.gridwidth = 3;
        a.gridheight = 2;
        add(no1, a);
        
        no2 = new JTextField(10);
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 1;
        a.gridy = 3;
        a.gridwidth = 4;
        a.gridheight = 2;
        add(no2, a);
        
        div = new JButton("÷");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 0;
        a.gridy = 5;
        a.gridwidth = 1;
        add(div, a);
                
        sub = new JButton("-");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 1;
        a.gridy = 5;
        a.gridwidth = 1;
        add(sub, a);
        
        mul = new JButton("x");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 2;
        a.gridy = 5;
        a.gridwidth = 1;
        add(mul, a);
        
        add = new JButton("+");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 3;
        a.gridy = 5;
        a.gridwidth = 1;
        add(add, a);
        
        res = new JLabel("");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 0;
        a.gridy = 7;
        a.gridheight = 2;
        a.gridwidth = 4;
        add(res, a);
        
        no3 = new JLabel("1st");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 0;
        a.gridy = 1;
        a.gridheight = 2;
        add(no3, a);
        
        no4 = new JLabel("2nd");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 0;
        a.gridy = 3;
        a.gridheight = 2;
        add(no4, a);
                        
        event ad = new event();
        add.addActionListener(ad);
        
        event1 subt = new event1();
        sub.addActionListener(subt);
        
        event2 mult = new event2();
        mul.addActionListener(mult);
        
        event3 divi = new event3();
        div.addActionListener(divi);
    }
     public class event implements ActionListener{ 
        public void actionPerformed(ActionEvent ad){  
            int c, d;
            c = (int)(Double.parseDouble(no1.getText()));
            d = (int)(Double.parseDouble(no2.getText()));
            int f = c + d;
            res.setText("The Sum is " + f);
        }
    }
     public class event1 implements ActionListener{ 
        public void actionPerformed(ActionEvent subt){  
            int c, d;
            c = (int)(Double.parseDouble(no1.getText()));
            d = (int)(Double.parseDouble(no2.getText()));
            int f = c - d;
            res.setText("The Difference is " + f);
        }
    }
     public class event2 implements ActionListener{ 
        public void actionPerformed(ActionEvent subt){  
            int c, d;
            c = (int)(Double.parseDouble(no1.getText()));
            d = (int)(Double.parseDouble(no2.getText()));
            int f = c * d;
            res.setText("The Product is " + f);
        }
    }
     public class event3 implements ActionListener{ 
        public void actionPerformed(ActionEvent subt){  
            double c, d;
            c = (double)(Double.parseDouble(no1.getText()));
            d = (double)(Double.parseDouble(no2.getText()));
            double f = c / d;
            res.setText("The Quotient is " + f);
        }
    }
       public static void main()  {
        Calculator gui = new Calculator();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(300, 150);
        gui.setVisible(true);
        gui.setTitle("Calculator");
    }
}