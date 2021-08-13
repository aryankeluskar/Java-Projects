import java.util.*;
class palin
{
    public static boolean pal(int i){
        StringBuffer sr = new StringBuffer("");
        sr.append(Integer.toString(i));
        // System.out.println(sr.reverse()+"  "+sr.reverse());
        return (Integer.parseInt(sr.reverse().toString())==i);
    }

    public static void main (String[] args) throws java.lang.Exception
    {
      try{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int p[]=new int[N];
        for(int i = 0; i<N; i++)
            p[i]=sc.nextInt();
        for (int i : p) {
            // System.out.println("In loop:"+i);
            // System.out.println();
            do{
                // System.out.println("In pro:"+i);
                i++;
            }while(!(pal(i)));
            System.out.println(i);
        }
        sc.close();
      }catch(Exception e){
			return;
		}   
    }
}