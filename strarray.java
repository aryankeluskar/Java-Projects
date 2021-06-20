import java.util.*;
/**
 * Write a description of class strarray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class strarray
{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String[] s = new String[3];
        for(int i = 0;i<3;i++)
        s[i] = sc.nextLine();
        for(int i = 0;i<3;i++)
        System.out.println(s[i]);
    }
}
