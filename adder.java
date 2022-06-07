import java.util.*;

public class adder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        sc.close();
        long s=0;
        for (int i = 1; i <= a; i++) {
            s+=i;
        }
        System.out.println(s);
    }
}