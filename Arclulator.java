import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;
import java.lang.*;
import java.awt.Font.*;
/**
 * Handityped in India by Aryan K
 * Version 
 * Completely Graphical User Interface based
 * Following functions must be there :- sin, tan, cos, hypo, ln, log, literally 90% calculations which can be done on a fx-991es-plus									 
 */ 
public class Arclulator extends JFrame {  
    JButton add, sub, div, mul, sq, cu, sqr, cur, exp, tab, si, ci, sin, cos, tan, rem;
    JButton reset, cal; 
    JLabel instructor, answerer1, tell1, tell2, tell3, res;
    JTextField no1, no2, no3;
    int x, c, d, e, resu;
    public Arclulator() {
        setLayout(new GridBagLayout());  
        GridBagConstraints a = new GridBagConstraints();
        int x;
        Font font1 = new Font("Serif",Font.BOLD,20);
        Font font2 = new Font("Arial",Font.PLAIN,15);
        
        instructor = new JLabel("Choose An Operation");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 5;        a.gridy = 3;
        a.gridwidth = 4;    a.gridheight = 1;
        instructor.setFont(font1);
        instructor.setVisible(true);    add(instructor, a);
        
        tell1 = new JLabel("");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 2;    a.gridy = 2;
        a.gridwidth = 2;    a.gridheight = 1;
        tell1.setVisible(true);  add(tell1, a);
        
        tell2 = new JLabel("");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 2;    a.gridy = 3;
        a.gridwidth = 2;    a.gridheight = 1;
        tell2.setVisible(true);  add(tell2, a);
        
        tell3 = new JLabel("");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 2;    a.gridy = 4;
        a.gridwidth = 2;    a.gridheight = 1;
        tell3.setVisible(true);  add(tell3, a);
        
        no1 = new JTextField("",10);
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 4;    a.gridy = 2;
        a.gridwidth = 4;    a.gridheight = 1;
        no1.setVisible(false);  add(no1, a);
        
        no2 = new JTextField("",10);
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 4;    a.gridy = 3;
        a.gridwidth = 4;    a.gridheight = 1;
        no2.setVisible(false); add(no2, a);
        
        no3 = new JTextField("",10);
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 4;    a.gridy = 4;
        a.gridwidth = 4;    a.gridheight = 1;
        no3.setVisible(false); add(no3, a); 
        
        div = new JButton("Divide");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 7;    a.gridy = 6;
        a.gridwidth = 2;    a.gridheight = 2;
        div.setVisible(true);   div.setFont(font2); 
        add(div, a);
                
        sub = new JButton("Subtract");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 5;    a.gridy = 6;
        a.gridwidth = 3;    a.gridheight = 2;
        sub.setVisible(true);   sub.setFont(font2);  
        add(sub, a);
        
        mul = new JButton("Multiply");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 3;    a.gridy = 6;
        a.gridwidth = 3;    a.gridheight = 2; mul.setFont(font2);
        mul.setVisible(true);  add(mul, a);
        
        add = new JButton("Addition");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 1;    a.gridy = 6;
        a.gridwidth = 3;    a.gridheight = 2; add.setFont(font2);
        add.setVisible(true);  add(add, a);
       
        exp = new JButton("Exponential Value");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 1;    a.gridy = 8;
        a.gridwidth = 2;    a.gridheight = 1; exp.setFont(font2);
        exp.setVisible(true);  add(exp, a); 
        
        sq = new JButton("Square");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 1;    a.gridy = 7;
        a.gridwidth = 2;    a.gridheight = 1; sq.setFont(font2);
        sq.setVisible(true);  add(sq, a);
        
        cu = new JButton("Cube");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 3;    a.gridy = 7; cu.setFont(font2);
        a.gridwidth = 2;    a.gridheight = 1;
        cu.setVisible(true);  add(cu, a);
        
        sqr = new JButton("Square Root");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 5;    a.gridy = 7; sqr.setFont(font2);
        a.gridwidth = 2;    a.gridheight = 1;
        sqr.setVisible(true);  add(sqr, a);
        
        cur = new JButton("Cube Root");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 7;    a.gridy = 7;
        a.gridwidth = 2;    a.gridheight = 1; cur.setFont(font2);
        cur.setVisible(true);  add(cur, a);
        
        tab = new JButton("Table");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 3;    a.gridy = 8;
        a.gridwidth = 2;    a.gridheight = 1; tab.setFont(font2);
        tab.setVisible(true);  add(tab, a);
        
        si = new JButton("Simple Intrest");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 5;    a.gridy = 8;
        a.gridwidth = 2;    a.gridheight = 1; si.setFont(font2);
        si.setVisible(true);  add(si, a);
        
        ci = new JButton("Compound Intrest");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 7;    a.gridy = 8;
        a.gridwidth = 2;    a.gridheight = 1; ci.setFont(font2);
        ci.setVisible(true);  add(ci, a);
                
        sin = new JButton("Sine Value");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 1;    a.gridy = 9;
        a.gridwidth = 2;    a.gridheight = 1; sin.setFont(font2);
        sin.setVisible(true);  add(sin, a);
        
        cos = new JButton("Cosine Value");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 3;    a.gridy = 9;
        a.gridwidth = 2;    a.gridheight = 1; cos.setFont(font2);
        cos.setVisible(true);  add(cos, a);
        
        tan = new JButton("Tan");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 5;    a.gridy = 9;
        a.gridwidth = 2;    a.gridheight = 1; tan.setFont(font2);
        tan.setVisible(true);  add(tan, a);
        
        rem = new JButton("Remainder");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 7;    a.gridy = 9;
        a.gridwidth = 2;    a.gridheight = 1; rem.setFont(font2);
        rem.setVisible(true);  add(rem, a);
        
        cal = new JButton("Calculate");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 7;    a.gridy = 11;
        a.gridwidth = 8;    a.gridheight = 2;
        cal.setVisible(true);  add(cal, a);
                
        answerer1 = new JLabel("Answerer");
        a.fill = GridBagConstraints.HORIZONTAL;
        a.gridx = 2;    a.gridy = 13;
        a.gridheight = 2;   a.gridwidth = 4; answerer1.setFont(font1);
        answerer1.setVisible(true);    add(answerer1, a); 
        
        event addi = new event();
        add.addActionListener(addi);
        
        event1 subt = new event1();
        sub.addActionListener(subt);
        
        event2 mult = new event2();
        mul.addActionListener(mult);
        
        event3 divi = new event3();
        div.addActionListener(divi);
        
        event4 squr = new event4();
        sq.addActionListener(squr);
        
        event5 cube = new event5();
        cu.addActionListener(cube);
        
        event6 sqro = new event6();
        sqr.addActionListener(sqro);
        
        event7 curo = new event7();
        cur.addActionListener(curo);
        
        event8 sii = new event8();
        si.addActionListener(sii);
        
        event9 cci = new event9();
        ci.addActionListener(cci);
        
        event10 sine = new event10();
        sin.addActionListener(sine);
        
        event11 cosi = new event11();
        cos.addActionListener(cosi);
        
        event12 tani = new event12();
        tan.addActionListener(tani);
        
        event13 table = new event13();
        tab.addActionListener(table);
        
        event14 rema = new event14();
        rem.addActionListener(rema);
        
        event15 expo = new event15();
        exp.addActionListener(expo);
        
        event16 calculate = new event16();
        cal.addActionListener(calculate);
        
        event18 res = new event18();
        
    }                        
    public class event implements ActionListener{ 
        public void actionPerformed(ActionEvent addi){            
            int x; tell1.setText("First Number");
            no1.setVisible(true);
            no2.setVisible(true);            
            tell2.setText("Second Number");
            x = 1;
        }
    }
    public class event1 implements ActionListener{
        public void actionPerformed(ActionEvent subt){             
            int x; tell1.setText("First Number");
            no1.setVisible(true);
            no2.setVisible(true);            
            tell2.setText("Second Number");
            x = 2;
        }
    }
    public class event2 implements ActionListener{
        public void actionPerformed(ActionEvent mult){  
            
            int x; tell1.setText("First Number");
            no1.setVisible(true);
            no2.setVisible(true);            
            tell2.setText("Second Number");
            x = 3;
        }
    }
    public class event3 implements ActionListener{
        public void actionPerformed(ActionEvent divi){  
            
            int x; tell1.setText("First Number");
            no1.setVisible(true);
            no2.setVisible(true);            
            tell2.setText("Second Number");
            x = 4;
        }
    }
    public class event4 implements ActionListener{
        public void actionPerformed(ActionEvent sq){  
            
            int x; tell1.setText("The Number");
            no1.setVisible(true);
            x = 5;
        }
    }
    public class event5 implements ActionListener{
        public void actionPerformed(ActionEvent cu){  
            
            int x; tell1.setText("The Number");
            no1.setVisible(true);
            x = 6;
        }
    }
    public class event6 implements ActionListener{
        public void actionPerformed(ActionEvent sqro){  
            
            int x; tell1.setText("The Number");
            no1.setVisible(true);
            x = 7;
        }
    }
    public class event7 implements ActionListener{
        public void actionPerformed(ActionEvent curo){  
            
            int x; tell1.setText("The Number");
            no1.setVisible(true);
            x = 8;
        }
    }
    public class event8 implements ActionListener{
        public void actionPerformed(ActionEvent sii){  
            
            int x; tell1.setText("PrinArclulatorpal");
            no1.setVisible(true);
            no2.setVisible(true);
            no3.setVisible(true);
            tell2.setText("Rate");
            tell2.setText("Time");
            x = 9;
         }
    }
    public class event9 implements ActionListener{
        public void actionPerformed(ActionEvent cci){  
            
            int x; tell1.setText("Principal");
            no1.setVisible(true);
            no2.setVisible(true);
            no3.setVisible(true);
            tell2.setText("Rate");
            tell2.setText("Time");
            x = 10;
        }
    }
    public class event10 implements ActionListener{
        public void actionPerformed(ActionEvent sine){  
            
            int x; tell1.setText("The Number");
            no1.setVisible(true);
            x = 11;
        }
    }
    public class event11 implements ActionListener{
        public void actionPerformed(ActionEvent tani){  
            
            int x; tell1.setText("The Number");
            no1.setVisible(true);
            x = 12;
        }
    }
    public class event12 implements ActionListener{
        public void actionPerformed(ActionEvent cosi){  
            int x;
             tell1.setText("The Number");
            no1.setVisible(true);
            x = 13;
        }
    }
    public class event15 implements ActionListener{
        public void actionPerformed(ActionEvent expo){  
            int x;
            tell1.setText("Base");
            no1.setVisible(true);
            no2.setVisible(true);            
            tell2.setText("Power");
            x = 14;
        }
    }
    public class event14 implements ActionListener{
        public void actionPerformed(ActionEvent table){  
            int x;
             tell1.setText("The Number");
            no1.setVisible(true);
            x = 15;
        }
    }
    public class event13 implements ActionListener{
        public void actionPerformed(ActionEvent rema){  
            int x; tell1.setText("Dividend");
            no1.setVisible(true);
            no2.setVisible(true);            
            tell2.setText("Divisor");
            x = 16;
        }
    }
    public class event16 implements ActionListener{
        public void actionPerformed(ActionEvent calculate){  
            if(x == 1){ 
                c = (int)(Double.parseDouble(no1.getText()));
                d = (int)(Double.parseDouble(no2.getText()));
                int resu = c + d;
                answerer1.setVisible(true);
                answerer1.setText("The Sum is " + resu);
            }
        }
    }
    public class event17 implements ActionListener{
        public void actionPerformed(ActionEvent reset){  
            int x;
            tell1.setText("First Number");
            no1.setVisible(true);
            no2.setVisible(true);            
            tell2.setText("Second Number");
            x = 1;
        }
    }
        public class event18 implements ActionListener{
        public void actionPerformed(ActionEvent addi){  
            int x;
            tell1.setText("First Number");
            no1.setVisible(true);
            no2.setVisible(true);            
            tell2.setText("Second Number");
            x = 1;
        }
    }
        public static void main()  {
        Arclulator gui = new Arclulator();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(550, 350);
        gui.setVisible(true);
        gui.setTitle("Calculator For Students");
    }
}
