import java.awt.*;
import java.awt.datatransfer.*;
import java.io.*;
import java.awt.event.*;
import javax.swing.*; 
/**
 * Beta Version - 1.0
 */
public class Ary_notepad extends JFrame{
    JMenu m;
    JLabel l;
    JMenuItem m1;
    JMenuItem m2;
    JMenuItem m3;
    JMenuItem m4;

    static JMenuBar mb;
    public JTextArea text = new JTextArea("");
    public String textin;
    public Ary_notepad(){       
        text.setBounds(20,20, 600,600);
        add(text);
        Font f = new Font("Arial",Font.PLAIN,30);
        m = new JMenu("File");
        m1= new JMenuItem("Open");
        m2=new JMenuItem("Save");
        m3=new JMenuItem("Copy");
        m4=new JMenuItem("Paste");

        text.setFont(f);
        m.add(m1);
        m.add(m2);
        m.add(m3);
        m.add(m4);
        save sa = new save();
        open o = new open();
        paste pa = new paste();
        m2.addActionListener(sa);
        m4.addActionListener(pa);
        m1.addActionListener(o);
        mb = new JMenuBar();
        mb.add(m);
        JScrollPane scrollableTextArea = new JScrollPane(text);   
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        add(scrollableTextArea);
        //l = new JLabel("hi");
        //l.setBounds(100,100, 300,300);
        //add(l);
        textin = "Hi";
    }
    class save implements ActionListener{
        class savewin extends JFrame{ 
            JTextField tf;
            JLabel l;
            JButton b;
            public savewin(){
                setLayout(new FlowLayout());
                l = new JLabel("Enter the file name");
                add(l);
                tf = new JTextField(26);
                add(tf);
                b = new JButton("SAVE");
                add(b);
                SIO sio = new SIO();
                b.addActionListener(sio);
            }
            class SIO implements ActionListener{ 
                public void actionPerformed(ActionEvent e){
                    try{    
                        FileOutputStream fout=new FileOutputStream("D:\\"+tf.getText()+".txt");    
                        String abcdef=text.getText();
                        fout.write(abcdef.getBytes());    
                        fout.close();    
                        //System.out.println(abcdef);    
                    }catch(Exception ex){} 
                }    
            }       
        }
        public void actionPerformed(ActionEvent s){
            savewin win = new savewin();
            win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            win.setSize(300, 150);
            win.setVisible(true);
            win.setTitle("Aryan INCORPORATED - Notepad");
        }
    }
    class copy implements ActionListener{ 
        public void actionPerformed(ActionEvent c){
            StringSelection data = new StringSelection(text.getText());
            Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
            cb.setContents(data, data);
        }
    }
    class paste implements ActionListener{ 
        public void actionPerformed(ActionEvent p){
            String s = "";
            try{
                Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();      
                Transferable t = cb.getContents(null);
                if (t.isDataFlavorSupported(DataFlavor.stringFlavor))
                    s = (t.getTransferData(DataFlavor.stringFlavor)).toString();
                text.setText(s);   
            }catch(UnsupportedFlavorException | IOException ex) {
                System.out.println("");
            }
        }
    }
    class open implements ActionListener{
        class openwin extends JFrame{ 
            JFileChooser fc=new JFileChooser();
            public openwin(){
                add(fc);
            }
            class OI implements ActionListener{ 
                public void actionPerformed(ActionEvent e){
                    int r = fc.showOpenDialog(null); 
                    String p="";
                    if (r == JFileChooser.APPROVE_OPTION) 
                        p=(fc.getSelectedFile().getAbsolutePath());      
                    String s="";
                    try{    
                        FileInputStream fin=new FileInputStream(p);    
                        s="";
                        int i=0;    
                        while((i=fin.read())!=-1)
                            s+=(char)i; 
                        fin.close();    
                    }catch(Exception ex){} 
                    text.setText(s);   
                }    
            }       
        }
        public void actionPerformed(ActionEvent s){
            openwin win = new openwin();
            win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            win.setSize(300, 150);
            win.setVisible(true);
            win.setTitle("Aryan INCORPORATED - Notepad");
        }
    }
    public static void main(){
        Ary_notepad win = new Ary_notepad();
        win.setJMenuBar(mb);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(600, 600);
        win.setVisible(true);
        win.setTitle("Aryan INCORPORATED - Notepad");
    }
}