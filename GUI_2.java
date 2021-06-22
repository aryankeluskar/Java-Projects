import javax.swing.*;
public class GUI_2 extends JFrame{
    JLabel label;
    public GUI_2(){
        label = new JLabel("    Hi!!");
        add(label);
    }
    public static void main(){
        GUI_2 win = new GUI_2();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(100, 100);
        win.setVisible(true);
        win.setTitle("Second Window");
    }
}    