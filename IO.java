import java.io.*;
/**
 * Just Uncomment what u wanna try
 */
class IO
{
    public static void main(){

        try{    
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
             fout.write("I am FileOutputStream".getBytes());    
             fout.close();    
             System.out.println("");    
        }catch(Exception e){} 
        
        try{    
            FileInputStream fin=new FileInputStream("D:\\testout.txt");    
            int i=0;    
            while((i=fin.read())!=-1)    
                System.out.print((char)i);     
            fin.close();    
        }catch(Exception e){}          
        
    }
}