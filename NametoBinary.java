import java.util.Scanner;
class NametoBinary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print('\u000C');
        System.out.print("Enter a word/sentence/number: ");
        String name = sc.nextLine();
        int x = name.length();
        System.out.print("The Unicode is ");
        for(int i = 0;i<x;i++)
        {
            System.out.print((int)(name.charAt(i)));
        } 
        System.out.println();
        System.out.print("The Binary is ");
        String bin = ""; 
        for(int j = 0;j<x;j++)
        {
            int val = (int)(name.charAt(j));
            while (val > 0)  
            { 
                if (val % 2 == 1) 
                { 
                    bin += '1';    
                } 
                else{
                    bin += '0';     
                }
                val /= 2;                 
            }
        }
        bin += '0';
        
        
        StringBuffer b = new StringBuffer(bin);
        
        
        System.out.print(b.reverse());    
        sc.close();    
    }
}