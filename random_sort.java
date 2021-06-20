import java.util.*;
class random_sort
{
    static int[] sort(int a[]){
        int t=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++){
                if(sorted.isSorted(a)){
                    return a;
                }
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        return a;
    }

    public static void main()
    {
        System.out.print('\u000C');
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        System.out.println("Enter size: ");
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i = 0;i<a;i++)
            arr[i] = ra.nextInt(10000);
        sort(arr);
        System.out.println("The entered nos in ascending order: ");
        for(int i=0;i<a;i++)
            System.out.println(arr[i]);
    }
}