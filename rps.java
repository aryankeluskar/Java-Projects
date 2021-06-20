import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
public class rps extends JFrame{
    JButton rock;
    JButton paper;
    JButton scissor;
    JLabel welcome, winner;
    JComboBox rounds;
    JLabel round;
    Random ra = new Random();
    public static int pl;
    public rps(){
        Font f = new Font("Arial",Font.BOLD,20);
        Font fw = new Font("Arial",Font.BOLD,13);
        setLayout(new FlowLayout());
        welcome = new JLabel("Welcome to Rock Paper Scissor, You have to play with Computer");
        welcome.setFont(fw);
        add(welcome);
        rock = new JButton("Rock");
        rock.setFont(f);
        add(rock);
        paper = new JButton("Paper");
        paper.setFont(f);
        add(paper);
        scissor = new JButton("Scissor");
        scissor.setFont(f);
        add(scissor);        
        winner = new JLabel();
        winner.setFont(f);
        add(winner);
        rock_clicked ro = new rock_clicked();
        paper_clicked pa = new paper_clicked();
        scissor_clicked sc = new scissor_clicked();
        rock.addActionListener(ro);
        paper.addActionListener(pa);
        scissor.addActionListener(sc);
    }
    class rock_clicked implements ActionListener{ 
        public void actionPerformed(ActionEvent ro){
            int a = ra.nextInt(3);
            if(a==0)
                winner.setText("This Round is A Tie");
            if(a==2)
                winner.setText("You Win this Round!!");
            if(a==1)
                winner.setText("Computer beat you, Try Again");
            //System.out.println((a)+" Rock");    
        }
    }
    class paper_clicked implements ActionListener{ 
        public void actionPerformed(ActionEvent pa){
            int a = ra.nextInt(3);
            //System.out.println((a)+" Paper");
            if(a==1)
                winner.setText("This Round is A Tie");
            if(a==0)
                winner.setText("You Win This Round!!");
            if(a==2)
                winner.setText("Computer beat you, Try Again");
        }
    }
    class scissor_clicked implements ActionListener{ 
        public void actionPerformed(ActionEvent sc){
            int a = ra.nextInt(3);
            //System.out.println((a)+" Scissor");
            if(a==2)
                winner.setText("This Round is A Tie");
            if(a==1)
                winner.setText("You Win This Round!!");
            if(a==0)
                winner.setText("Computer beat you, Try Again");
        }
    }
    public static void main(){
        rps win = new rps();
        //System.out.print('\u000C');
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(460, 250);
        win.setVisible(true);
        win.setTitle("Rock Paper Scissor");
    }
}