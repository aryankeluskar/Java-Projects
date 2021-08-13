/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        try {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            if (N>1000||N<0) {
                System.out.println(7);
                throw new Exception("Number");
            } else {      
                int[] res = new int[N];
        
                for (int i = 0; i < N; i++) {
                    // System.out.println(3);
                    sc.next();
                    String s = sc.nextLine();
                    // sc.next();
                    System.out.println(s);
                    String[] med = s.split(" ");
                    int[] mds = new int[6];
                    System.out.println(5);
                    for (int j=0; j<6; j++) {
                        System.out.println(med[j]);
                        mds[j] = Integer.parseInt(med[j]);
                        System.out.println(8);                       
                    }
                    if((mds[0]+mds[1]+mds[2])>(mds[4]+mds[5]+mds[5])){
                        res[i]=1;
                    }
                    else if((mds[0]+mds[1]+mds[2])<(mds[4]+mds[5]+mds[5])){
                        res[i]=0;
                    }
                }
                for (int i : res) {
                    System.out.println(5);
                    System.out.println(i);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
	}
}
