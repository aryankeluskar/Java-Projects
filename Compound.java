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
        long CI = (new Double(p*(power((1.0+(r/100.0)),t)))).longValue();
        return CI;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter p, r, t");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        Compound c = new Compound();
        System.out.println(c.cal(p,r,t));
        System.out.println("Montly Pay: "+comma_adder.it((c.cal(p,r,t))/(new Double(t).longValue()*12l)));
    }
}