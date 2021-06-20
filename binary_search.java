import java.util.*;
class binary_search
{
    static int binarysearch(int a[], int s){
        int fd=0;
        int f=1,l=a.length-1, m;
        while(f<=1&&fd==0){
            m=(f+l)/2;
            if(s==a[m]){
             fd=1;
             return m;
            }
            else if(s>a[m])
             f=m+1;
            else
             l=m-1;
        }
        return -1;
    }
    public static void main(){
        System.out.print('\u000C');
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers in ascending order");
        int a[] = new int[5];
        for(int i = 0;i<5;i++)
         a[i]=sc.nextInt();
        System.out.println("Enter a number to be searched"); 
        int s = sc.nextInt();
        System.out.println(binarysearch(a, s));
    }
}