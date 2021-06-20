import java.util.*;
class rev_selection_sort
{
    static int[] sort(int ar[]){
        sorted so = new sorted();    
        for(int i=0;i<ar.length;i++)
        {
            int small=ar[i], sidx=i;
            if(sorted.isSorted(ar))
                return ar;
            for(int j=i+1;j<ar.length;j++)
            {
                if(small<ar[j])
                {
                    small=ar[j];
                    sidx=j;
                }
            }
            int t=ar[i];
            ar[i]=ar[sidx];
            ar[sidx]=t;
        }
        return ar;
    }
    public static void main()
    {
        System.out.print('\u000C');
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int N = sc.nextInt();
        int ar[]=new int[N];
        System.out.println("Enter "+N+" numbers");
        for(int i=0;i<N;i++)
            ar[i]=sc.nextInt();       
        sort(ar);
        for(int i=0;i<N;i++)       
            System.out.println(ar[i]);   
     }
}
