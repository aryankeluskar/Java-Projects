import java.util.*;
public class rev_order
{
    public static void main(){
        System.out.print('\u000C');
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");
        String s = sc.nextLine();
        String row = "";
        int a = 0;
        String r2="";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i); //extracting the current character at index i
            char ch1=s.charAt(i==0?i:i-1);
            if(ch==32 && ch1==32) //two or more continous space
            {
                a++;
                r2+=" ";
                continue;
            }
            if(ch==32||i==s.length()-1) //extract a word when u find space or u come to end of the string
            {
                String w=s.substring(a,i);
                if(i==s.length()-1)
                 w=s.substring(a);
                String rw = "";

                for(int j = w.length()-1;j>=0;j--)
                {
                    rw+=w.charAt(j);
                }
                r2+=rw;
                r2+=" ";
                a=i+1; //change the next word begin
            } //close the if
        }
        for(int i = r2.length()-1;i>=0;i--)
        {
            row+=r2.charAt(i);
        }
        System.out.println();
        System.out.println(row);
    }
}