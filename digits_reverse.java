import java.util.Scanner;

public class digits_reverse
{
    public static void main(String[] args){
        System.out.print('\u000C');
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int t = a;
        int r=0;
        while(t>0)
        {
            r=r*10+t%10;
            t/=10;
        }
        System.out.println("Original: "+ a);
        System.out.println("Reversed: "+ r);
    }
}
