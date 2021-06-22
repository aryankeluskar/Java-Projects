import java.util.*;
public class Compound   //PURE
{
    public double power(double a, double b){
        double p=1;
        for(int i=0;i<b;i++){
            p*=a;
        }
        return p;
    }
    public long cal(double p, double r, double t){
        long CI = Math.round((p*(power((1.0+(r/100.0)),t))));
        return CI;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p, r, t");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        Compound c = new Compound();
        System.out.println(it(c.cal(p,r,t)));
        System.out.println("Montly Pay: "+it((c.cal(p,r,t))/(Math.round(t)*12l)));
        sc.close();
    }
    public static String it(long n){
        String s=Long.toString(n);
        if(n<1000)
            return s;
        else{
            String d="";
            String c="";
            for(int i=s.length()-5;i>-1;i-=2){
                c+=s.charAt(i+1);
                c+=s.charAt(i);
                c+=",";
            }
            
            for(int i=c.length()-1;i>=0;i--)
                d+=c.charAt(i);
            d=d.substring(1);
            d+=",";    
            d+=s.substring(s.length()-3);
            return d;
        }
    }
}