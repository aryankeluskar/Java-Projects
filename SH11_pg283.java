import java.util.*;
public class SH11_pg283
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine(); 

        s=s.toUpperCase();
        int a=0; 
        String s1 = "";

        for(int i=1;i<s.length();i++)
        {
            char ch=s.charAt(i); 
            char ch1=s.charAt(i-1); 

            if(ch==32 && ch1==32) 
            {
                a++;
                continue;
            }

            if(ch==32 ||i==s.length()-1) 
            {
                String w=s.substring(a,i);
                if(i==s.length()-1) 
                    w=s.substring(a);

                a=i+1; 
                
                s1 += w.charAt(0) ;
                
            } 
        }
        System.out.println("The new word:" +s1);
        char []arr = s1.toCharArray();
        Arrays.sort(arr);
        System.out.println("Arranged in alphabetical order: "+String.valueOf(arr));
        sc.close();
        
    } 
} 
