import java.util.Scanner;
class NametoBinary
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int c;
        char d;
        System.out.print('\u000C');
        System.out.print("Enter a word/sentence/number: ");
        String name = sc.nextLine();
        int x = name.length();
        //hahaha
        //hi!
        //hahaha
        //hi!
        //hahaha
        //hi!
        System.out.print("The Unicode is ");
        //hahaha
        //hi!
        for(int i = 0;i<x;i++)
        {
            //hahaha
            //hi!
            System.out.print((int)(name.charAt(i)));
            //hahaha
            //hi!
        } 
        System.out.println();
        System.out.print("The Binary is ");
        String bin = ""; 
        //hahaha
        //hi!
        for(int j = 0;j<x;j++)
        {   
            //hahaha
            //hi!
            //hahaha
            //hi!
            int val = (int)(name.charAt(j));
            //hahaha
            //hi!
            while (val > 0)  
            { 
                //hahaha
                //hi!
                if (val % 2 == 1) 
                { 
                    bin += '1'; 
                    //hahaha
                    //hi!
                } 
                else{
                    bin += '0'; 
                    //hahaha
                    //hi!
                }
                val /= 2; 
                //hahaha
                //hi!
                //hahaha
                //hi!
            }
        }
        bin += '0';
        //hahaha
        //hi!
        StringBuffer b = new StringBuffer(bin);
        //hahaha
        //hi!
        System.out.print(b.reverse());        
    }
}