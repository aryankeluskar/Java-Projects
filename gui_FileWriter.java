import java.awt.*;
import javax.swing.*; 
import java.io.*;
import java.awt.event.*;
class gui_FileWriter extends JFrame{
    private JButton b; 
    private JTextField tf;
    private JLabel l;
    gui_FileWriter(){
      setLayout(new FlowLayout());  
      b = new JButton("Click!!!!!"); 
      add(b);
      tf = new JTextField(50);
      add(tf);
      l = new JLabel("");
      add(l);
      event e = new event();
      b.addActionListener(e);
    }
    class event implements ActionListener{ 
        public void actionPerformed(ActionEvent e){
            try 
            {
                String doc = tf.getText();
                FileWriter docs = new FileWriter("D:\\doc.txt");
                BufferedWriter out = new BufferedWriter(docs);
                out.write(doc);
                out.close();
                l.setText("Done! Wrote "+doc+", Open doc.txt in D"); 
                tf.setVisible(false);
            } catch(Exception sdduigdugd){}
        }
    } 
    public static void main(){
      gui_FileWriter Aru = new gui_FileWriter();
      Aru.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Aru.setSize(300,150);
      Aru.setVisible(true);
      Aru.setTitle("GUI File Writer");
      Aru.pack();
      }
}