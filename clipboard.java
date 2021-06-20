import java.awt.datatransfer.*;
import java.awt.*;
import java.io.*;
class clipboard{
   public static void main(){        
      StringSelection data = new StringSelection("This is copied to the clipboard");
      Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
      cb.setContents(data, data);
      try {
         Transferable t = cb.getContents(null);
         if (t.isDataFlavorSupported(DataFlavor.stringFlavor))
            System.out.println(t.getTransferData(DataFlavor.stringFlavor));
      }catch(UnsupportedFlavorException | IOException ex) {
          System.out.println("");
      }
   }
}