import java.awt.Robot; 
import java.util.*;
import java.awt.AWTException;

public class key_hijacker
{
    public static void main() throws InterruptedException, AWTException{
        String m[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---", ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] s = "Hello World".toUpperCase().toCharArray();
        Robot rts = new Robot();
        
        for(char i:s){
            if(Character.isLetter(i)){
                for(int j =0;j<m[i-65].length();j++){
                    System.out.print(m[i-65].charAt(j));
                    rts.keyPress(20);
                    if(m[i-65].charAt(j) == '.')
                    Thread.sleep(300);
                    if(m[i-65].charAt(j) == '-')
                    Thread.sleep(900);
                    rts.keyRelease(20);
                }
                System.out.print(" ");
            }
            if(i==32)
                System.out.print("\t");
        }
    }
}