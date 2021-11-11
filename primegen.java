import java.io.*;
import java.lang.*;


class Primegen
{
	public static void main (String[] args) throws java.lang.Exception
	{
        
        InputStreamReader r=new InputStreamReader(System.in);  
        BufferedReader br = new BufferedReader(r);	
        int N = Integer.parseInt(br.readLine());
        String[] inputs = new String[N];
        for (int i = 0; i<N;i++){
            inputs[i]=br.readLine();
        }
        for (int i = 0; i < N; i++) {
            String in = inputs[i];
            // System.out.println(in);
            int a = Integer.parseInt(in.substring(0, in.indexOf(' ')));
            int b = Integer.parseInt(in.substring(in.indexOf(' ')+1));
            // System.out.println(a+" "+b);
            for (int j = a; j <= b; j++) {
                if(checkPrime(j)){
                    System.out.println(j);
                }
            }
            System.out.println();
        }
	}
    static boolean checkPrime(int n){  
        int i,m=0,flag=0;      
        m=n/2;      
        if(n==0||n==1){  
            return false;    
        }else{  
         for(i=2;i<=m;i++){      
          if(n%i==0){      
            flag=1;   
            return false;
          }      
         }      
         if(flag==0)  
         { return true; }  
         else
         return false;
        }  
      }  
}