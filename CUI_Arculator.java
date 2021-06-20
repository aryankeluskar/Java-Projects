import java.util.*;
/**
* Handityped in India by Aryan K
* Version 1.0
* Completely Character User Interface based
* Following functions must be there :- sin, tan, cos, hypo, ln, log, literally 90% calculations which can be done on a fx-991es-plus                                    
*/ 
public class CUI_Arculator
{
    static double power(double a, double b)
    {
        double p = 1;
        for(int i = 0;i<(Math.ceil(b));i++)
        p*=a;
        return p;
    }
    public static void main(){
       Scanner sc = new Scanner(System.in);
       String choice = "Nothing";
       System.out.print('\u000C');
       do{
            System.out.println("Select your operation by entering the character in [] brackets");
            System.out.println("[A]ddition");
            System.out.println("[S]ubtraction");
            System.out.println("[M]ultiplication");
            System.out.println("[D]ivision");
            System.out.println("[R]emainder");
            System.out.println("[E]xponential");
            System.out.println("[Sq]uare Root");
            System.out.println("[Cu]be Root");
            System.out.println("[Eq]uation Solving");
            System.out.println("[Me]nsuration");
            System.out.println("[Si]mple Intrest");
            System.out.println("[Co]mpound Intrest");
            System.out.println("[Tr]igonometry");
            System.out.println("[Ta]ble");
            choice = sc.nextLine();
            choice = choice.toUpperCase();
            double a, b;
            switch(choice){
                case "A":
                System.out.println("Enter two numbers");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Answer is "+(a+b));
                break;
                case "B":
                System.out.println("Enter two numbers");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Answer is "+(a-b));
                break;
                case "M":
                System.out.println("Enter two numbers");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Answer is "+(a*b));
                break;
                case "D":
                System.out.println("Enter two numbers");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Answer is "+(a/b));
                break;
                case "R":
                System.out.println("Enter two numbers");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Answer is "+(a%b));
                break;
                case "E":
                System.out.println("Enter two numbers");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Answer is "+(power(a,b)));
                break;
                case "SQ":
                System.out.println("Enter a numbers");
                a = sc.nextDouble();
                System.out.println("Answer is "+Math.sqrt(a));
                break;
                case "CU":
                System.out.println("Enter a numbers");
                a = sc.nextDouble();
                System.out.println("Answer is "+Math.cbrt(a));
                break;     
                case "EQ":
                System.out.println("[L]inear in one variable");
                System.out.println("[Li]near in two variable");
                System.out.println("[Q]uadratic");
                System.out.println("[C]ubic");
                String ch = sc.next();
                ch = ch.toUpperCase();
                double aa,bb,c,x1,x2,x3;
                switch(ch){
                    case "L":
                    System.out.println("Enter coeffecients in form: ax + b = 0");
                    aa = sc.nextDouble();
                    bb = sc.nextDouble();
                    System.out.println((-bb)/aa);
                    break;
                    case "LI":
                    System.out.println("Enter coeffecients of frst equation in form:");
                    System.out.println("ax + by + c = 0");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    c = sc.nextDouble();
                    System.out.println("Enter coeffecients of second equation in form:");
                    System.out.println("ax + by + c = 0");
                    aa = sc.nextDouble();
                    bb = sc.nextDouble();
                    x3 = sc.nextDouble();
                    break;
                    case "Q":
                    System.out.println("Enter 3 values as coefficients of a quadratic equation");
                    System.out.println("in form of ax2+bx+c");
                    System.out.println("First a then b then c");        
                    aa = sc.nextDouble();
                    bb = sc.nextDouble();
                    c = sc.nextDouble(); 
                    
                    x1 = (-bb + Math.sqrt(bb*bb - 4*aa*c))/(2*aa);
                    x2 = (-bb - Math.sqrt(bb*bb - 4*aa*c))/(2*aa);
                    System.out.println("The two values of x are: "+x1+" & "+x2);
                    
                }    
            }
         choice = sc.nextLine();
       }while(choice=="Y");
    }
}