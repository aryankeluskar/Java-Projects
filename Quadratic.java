import java.util.*;
/**
 * Write a description of class Quadratic here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Quadratic
{
    public static void main(){ 
        System.out.print('\u000C');
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 values as coefficients of a quadratic equation");
        System.out.println("in form of ax2+bx+c");
        System.out.println("First a then b then c");        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble(); 
        double x1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        double x2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println("The two values of x are: "+x1+" & "+x2);
    }
}
