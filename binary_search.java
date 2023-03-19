import java.util.*;
class binary_search
{
    static int binarysearch(int a[], int s){
        int fd=0, result = -1;
        int f=0,l=a.length, m;
        while(f<1 && fd==0){
            m=(f+l)/2;
            if(s==a[m]){
                fd=1;
                result = m;
            }
            else if(s>a[m])
             f=m+1;
            else
             l=m-1;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.print('\u000C');
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms");
        int n = sc.nextInt();
        System.out.println("Enter "+n+" numbers in ascending order");
        int a[] = new int[n];
        for(int i = 0;i<n;i++)
         a[i]=sc.nextInt();
        System.out.println("Enter a number to be searched"); 
        int s = sc.nextInt();

        System.out.println(binarysearch(a, s));
        int res = binarysearch(a, s);
        if(res == -1)
            System.out.println("Not Found in the list");
        else
            System.out.println("Found at index "+res);
        sc.close();
    }
}