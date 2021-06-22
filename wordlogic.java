import java.util.*;
class wordlogic
{
    public static void main()
    {
        System.out.print('\u000C');
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine(); //accept string into s
        int a=0; //variable to keep of the word begin index
        int c = 0;
        int cl = 0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i); //extracting the current character at index i
            char ch1=s.charAt(i==0?i:i-1); //extracting the previous character at i-1
            
            if(ch==32 && ch1==32) //two or more continous space
            {
                a++;
                break;
 
            }
            if(ch==32||i==s.length()-1) //extract a word when u find space or u come to end of the string
            {
                String w=s.substring(a,i);
                if(i==s.length()-1) //if last character which might not end with a space
                    w=s.substring(a);
                System.out.println(w);        
                a=i+1; //change the next word begin
                c++;
                for(int j=0;j<w.length();j++)
                 cl++;
            } //close the if
        }//close the for
        System.out.println("No of Words: "+c);
        System.out.println("No of Letters: "+cl);
        //output statements
        sc.close();
    } //function close
} //class close
