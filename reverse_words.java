import java.util.*;
public class reverse_words{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a string");
        String r = sc.nextLine();

        String s="";
        for(int i=r.length()-1;i>=0;i--)
            s+=r.charAt(i);

        r="";
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String w =st.nextToken();
            for(int i=w.length()-1;i>=0;i--)
            r+=w.charAt(i);
            r+=" ";        
        }
        
        sc.close();
        System.out.println(r);
    }
}