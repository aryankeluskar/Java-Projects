import java.util.*;
class algebra{
    public static void main(){
        System.out.println("I can solve Equation in form of :-");
        System.out.println("1.Quadratic");
        System.out.println("2.Cubic");
        System.out.println("3.Quartic");
        System.out.println("4.Linear Equation In One Variables");
        System.out.println("5.Linear Equation In Two Variables");
        System.out.println("6.Exit");
        System.out.println("Enter the number next to it");
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        if(in == 1){
            System.out.println("Enter the coefficients of the quadratic equation");
            System.out.println("in form of ax2+bx+c = 0");
        }
        if(in == 2){
            System.out.println("Enter the coefficients of the quadratic equation");
            System.out.println("in form of ax3+bx2+cx+d= 0");
        }
        if(in == 3){
            System.out.println("Enter the coefficients of the quadratic equation");
            System.out.println("in form of ax2+bx+c = 0");
        }
        if(in == 4){
            System.out.println("Enter the coefficients of the quadratic equation");
            System.out.println("in form of ax2+bx+c = 0");
        }
        if(in == 5){
            System.out.println("Enter the coefficients of the quadratic equation");
            System.out.println("in form of ax2+bx+c = 0");
        }
        if(in == 6){
            System.out.println("Enter the coefficients of the quadratic equation");
            System.out.println("in form of ax2+bx+c = 0");
        }
        sc.close();
    }
}