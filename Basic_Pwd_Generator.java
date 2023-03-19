import java.util.*;
class Password_Generator
{
    private int age; private String f,m,l;
    public Password_Generator(){
        f=m=l="";
        age=0;
    }
    public Password_Generator(int aa, String ff, String mm, String ll){
        f=ff;
        m=mm;
        l=ll;
        age=aa;
    }
    public static String Generate_Password(){
        String p=l.charAt(0)+l.charAt(l.length()-1)+(age%10)+f.charAt(0)+f.charAt(f.length()-1)+((age/10)%10)+m.charAt(0)+Integer.toString((m.charAt(m.length()-1)));
        return p;
    }
    public void Display_Pasword(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age, first,  middle and last name");
        int a = sc.nextInt();
        String fi=sc.next();
        String mi=sc.next();
        String la=sc.next();
        
    }
}