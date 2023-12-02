import java.util.*;

/**
 * Hand-typed in India by Aryan K
 * Completely Character User Interface based
 */
class CUI_Arculator {
    static double power(double a, double b) {
        double p = 1;
        for (int i = 0; i < (Math.ceil(b)); i++)
            p *= a;
        return p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "Nothing";
        System.out.print('\u000C');

        System.out.println("Select your operation by entering the character in [] brackets");
        System.out.println("[A]ddition");
        System.out.println("[S]ubtraction");
        System.out.println("[M]ultiplication");
        System.out.println("[D]ivision");
        System.out.println("[R]emainder");
        System.out.println("[E]xponential");
        System.out.println("[Sq]uare Root");
        System.out.println("[Cu]be Root");
        System.out.println("Solve Algebraic [Eq]uation");
        System.out.println("[Trig]onometric Calculations");
        System.out.println("[De]terminant of 2x2 Matrix");
        System.out.println("[Det]erminant of 3x3 Matrix");
        choice = sc.nextLine();
        choice = choice.toUpperCase();
        double a, b;
        switch (choice) {
            case "A":
                System.out.println("Enter two numbers");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Answer is " + (a + b));
                break;
            case "B":
                System.out.println("Enter two numbers");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Answer is " + (a - b));
                break;
            case "M":
                System.out.println("Enter two numbers");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Answer is " + (a * b));
                break;
            case "D":
                System.out.println("Enter two numbers");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Answer is " + (a / b));
                break;
            case "R":
                System.out.println("Enter two numbers");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Answer is " + (a % b));
                break;
            case "E":
                System.out.println("Enter two numbers");
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println("Answer is " + (power(a, b)));
                break;
            case "SQ":
                System.out.println("Enter a number");
                a = sc.nextDouble();
                System.out.println("Answer is " + Math.sqrt(a));
                break;
            case "CU":
                System.out.println("Enter a number");
                a = sc.nextDouble();
                System.out.println("Answer is " + Math.cbrt(a));
                break;
            case "EQ":
                System.out.println("[L]inear in one variable");
                System.out.println("[Q]uadratic");
                String ch = sc.next();
                ch = ch.toUpperCase();
                double aa, bb, c, x1, x2;
                switch (ch) {
                    case "L":
                        System.out.println("Enter coeffecients in form: ax + b = 0");
                        aa = sc.nextDouble();
                        bb = sc.nextDouble();
                        System.out.println((-bb) / aa);
                        break;

                    case "Q":
                        System.out.println("Enter 3 values as coefficients of a quadratic equation");
                        System.out.println("in form of ax2+bx+c");
                        System.out.println("First a then b then c");
                        aa = sc.nextDouble();
                        bb = sc.nextDouble();
                        c = sc.nextDouble();

                        x1 = (-bb + Math.sqrt(bb * bb - 4 * aa * c)) / (2 * aa);
                        x2 = (-bb - Math.sqrt(bb * bb - 4 * aa * c)) / (2 * aa);
                        System.out.println("The two values of x are: " + x1 + " & " + x2);

                }
            break;

            case "DE":
                System.out.println("Enter the elements of 2x2 matrix");
                double[][] matrix = new double[2][2];
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 2; j++) {
                        matrix[i][j] = sc.nextDouble();
                    }
                }
                System.out.println("Answer is " + (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]));
            break;

            case "DET":
                System.out.println("Enter the elements of 3x3 matrix");
                double[][] matrix3 = new double[2][2];
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        matrix3[i][j] = sc.nextDouble();
                    }
                }
                double det = matrix3[0][0] * ((matrix3[1][1] * matrix3[2][2]) - (matrix3[1][2] * matrix3[2][1])) - matrix3[0][1] * ((matrix3[1][0] * matrix3[2][2]) - (matrix3[1][2] * matrix3[2][0])) + matrix3[0][2] * ((matrix3[1][0] * matrix3[2][1]) - (matrix3[1][1] * matrix3[2][0]));
                System.out.println("Answer is: " + det);
            break;
                
            case "TRIG":
                System.out.println("[Sin]");
                System.out.println("[Cos]");
                System.out.println("[Tan]");
                System.out.println("[Arcsin]");
                System.out.println("[Arccos]");
                System.out.println("[Arctan]");
                String trigChoice = sc.nextLine();
                trigChoice = trigChoice.toLowerCase();
                switch (trigChoice) {
                    case "sin":
                        System.out.println("Enter a number in degrees");
                        a = sc.nextDouble();
                        System.out.println("Answer is " + Math.sin(Math.toRadians(a)));
                    break;
                    case "cos":
                        System.out.println("Enter a number in degrees");
                        a = sc.nextDouble();
                        System.out.println("Answer is " + Math.cos(Math.toRadians(a)));
                    break;
                    case "tan":
                        System.out.println("Enter a number in degrees");
                        a = sc.nextDouble();
                        System.out.println("Answer is " + Math.tan(Math.toRadians(a)));
                    break;
                    case "arcsin":
                        System.out.println("Enter a number between -1 and 1");
                        a = sc.nextDouble();
                        System.out.println("Answer is " + Math.toDegrees(Math.asin(a)));
                    break;
                    case "arccos":
                        System.out.println("Enter a number between -1 and 1");
                        a = sc.nextDouble();
                        System.out.println("Answer is " + Math.toDegrees(Math.acos(a)));
                    break;
                    case "arctan":
                        System.out.println("Enter a number");
                        a = sc.nextDouble();
                        System.out.println("Answer is " + Math.toDegrees(Math.atan(a)));
                    break;
                }
            break;
                
        }
        sc.close();
    }
}