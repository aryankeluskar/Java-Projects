import java.util.*;
import java.text.*;
class sleep extends Thread{
    public static void main(){
        System.out.print('\u000C');
        Scanner sc = new Scanner(System.in);
        System.out.println("How many seconds do you want the timer for?");
        int t = sc.nextInt();
        t*=1000;
        SimpleDateFormat full = new SimpleDateFormat("hh:mm:ss a");
        Date d = new Date();
        System.out.println("Now is "+ full.format(d));
        try{
         Thread.sleep(t);
        } catch(Exception e){        }
        Date d1 = new Date();
        System.out.println("After "+t/1000+" seconds is "+ full.format(d1));
    }
}