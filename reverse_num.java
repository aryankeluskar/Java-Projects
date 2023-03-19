import java.util.Scanner;

public class reverse_num
{
    public int reverse(int nn){
        if(nn==0)
            return 0;
            //System.out.println(nn+ " " +Integer.toString(nn).length()+" " +(int)Math.pow(10, Integer.toString(nn).length()-1));
        return (nn%10)*(int)Math.pow(10, Integer.toString(nn).length()-1) + reverse(nn/10);
    }
    public static void main(String[] args){
        reverse_num rn = new reverse_num();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be reverse");
        int in = sc.nextInt();
        System.out.println(rn.reverse(in));
    }
}