import java.util.*;
class bubble_sort
{
    static int[] sort(int a[]){
        int t=0;
        sorted s = new sorted();
        for(int i=0;i<a.length;i++)
        {
          for(int j=0;j<a.length-1;j++)
          if(s.isSorted(a))
           return a;
          else if(a[j]>a[j+1])
          {
            t=a[j];
            a[j]=a[j+1];
            a[j+1]=t;
          }
        }
        return a;
    }
    public static void main()
    {
        System.out.print('\u000C');
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any 5 numbers: ");
        int []arr=new int[5];
        for(int i=0;i<5;i++)
        arr[i]=sc.nextInt();
        sort(arr);
        System.out.println("The entered nos in ascending order: ");
        for(int i=0;i<5;i++)
        System.out.println(arr[i]);
    }
}