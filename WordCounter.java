import java.awt.*;
import java.awt.datatransfer.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*; 
/**
 * Beta Version - 1.0
 */
public class WordCounter extends JFrame{
    public JTextArea text = new JTextArea("");
    public WordCounter(){
        text.setBounds(0,0, 600,600);
        add(text);
        Font f = new Font("Arial",Font.PLAIN,30);
        text.setFont(f);
    }
    public static void main(){
        WordCounter win = new WordCounter();
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(1000, 600);
        win.setVisible(true);
        win.setTitle("Aryan INCORPORATED - WordCounter");
    }
}