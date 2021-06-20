
/**
 * Write a description of class digits_reverse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class digits_reverse
{
    public static void main(String[] args){
        System.out.print('\u000C');
        int a = 48741;
        int t = a;
        int r=0;
        while(t>0)
        {
            r=r*10+t%10;
            t/=10;
        }
        System.out.println(a);
        System.out.println(r);
    }
}
