import java.util.*;
import java.lang.*;

public class smallf {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0;i<N;i++){
            arr[i]=sc.nextInt();            
        }
        for(int i = 0;i<N;i++){
            System.out.println(factorial(arr[i]));
        }
    }

    static String factorial(int n)
    {
        int res[] = new int[500];
 
        
        res[0] = 1;
        int res_size = 1;
 
        for (int x = 2; x <= n; x++)
            res_size = multiply(x, res, res_size);
 
        String result = "";        
        for (int i = res_size - 1; i >= 0; i--)
            result+=res[i];
        return result;
    }

    static int multiply(int x, int res[], int res_size)
    {
        int carry = 0; 
        for (int i = 0; i < res_size; i++)
        {
            int prod = res[i] * x + carry;
            res[i] = prod % 10; 
            carry = prod/10; 
        }
        while (carry!=0)
        {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }
}
