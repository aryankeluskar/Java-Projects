import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> nums = new ArrayList<Integer>();
        do{
            nums.add(sc.nextInt());
        } while(nums.get(nums.size()-1)!=42);
        nums.remove(nums.size()-1);
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
	}
}