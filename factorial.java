import java.util.*;
import java.math.*;

public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println( calculate(sc.nextInt()));
        sc.close();
    }


    //Selects the most optimised method
    public static String calculate(int n){
        if(n<13&&n>-13)
            return fact_int(n);
        else
            return fact_big(n);
    }   

    public static String calculate(long n){
        if(n<13&&n>-13)
            return fact_int((int)n);
        else if(n<21&&n>-21)
            return fact_long((int)n);
        else
            return fact_big(n);
    }   


    //Uses Big Integer
    public static String fact_big(int n)
    {
        BigInteger f = new BigInteger("1");
        for(int i = 1; i<=n; i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f.toString();
    }
    public static String fact_big(long n)
    {
        BigInteger f = new BigInteger("1");
        for(int i = 1; i<=n; i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f.toString();
    }


    //Uses only int
    public static String fact_int(int n)
    {
        int f=1;
        for(int i = 1; i<=n; i++){
            f*=i;
        }
        return Integer.toString(f);
    }


    //Uses only long
    public static String fact_long(int n){
        long f=1;
        for(long i = 1; i<=n; i++){
            f*=i;
        }
        return Long.toString(f);
    }
}
