import java.util.Scanner;

// Below this comment: import the Scanner

class Initials {
    public static void main(String[] args) {
        // Below this comment: declare and instantiate a Scanner
        Scanner sc = new Scanner(System.in);

        // Below this comment: declare any other variables you may need
        System.out.print("Enter name : ");
        String name = sc.nextLine();
        // Below this comment: collect the required inputs

        // Below this comment: call your required method

        // Below this comment: disply the required results
        System.out.println("For "+name+" initials are : "+toInitials(name));
    }

    // define your required method here below
    public static String toInitials(String inp) {
        String output = inp.charAt(0);
        output += ".";
        for (int i = 0; i < array.length; i++) {
            output += " ";
            if (inp.charAt(i) == ' ')
                output = output + inp.charAt(i + 1) + ".";
        }
    }
}
