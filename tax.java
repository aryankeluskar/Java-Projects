import java.util.*;
class tax
{   
    public static void main(){
        System.out.print('\u000C');
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age");
        long a = sc.nextLong();/** In case this program is used by Thanos or Ancient One or Ghosts or Aliens, hence long is taken*/
        if(a>60)
            System.out.println("You should not pay Income Tax");
        else{    
            System.out.println("Enter your Taxable Income"); 
            long i = sc.nextLong();/**In case this program is used by Mukesh Ambani or Jeff Bezos or Bill Gates or Gautam Adani, hence long is taken*/
            if(i<=250000)
                System.out.println("Income Tax for you is Zero");    
            else if(i<=500000)
                System.out.println("Income Tax for you is "+(i-250000)*0.1);
            else if(i<=1000000)
                System.out.println("Income Tax for you is "+(i-500000)*0.2+34000);
            else if(i>1000000)
                System.out.println("Income Tax for you is "+(i-1000000)*0.3+94000);    
        }
        sc.close();
    }
}
