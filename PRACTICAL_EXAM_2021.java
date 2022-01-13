import java.util.*;

public class PRACTICAL_EXAM_2021 {
    public static void main(String[] args){
        Q1.main();
        Q2.main();
        Q3.main();
    }
}

class Q1{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(!(s.endsWith(".")||s.endsWith("?")||s.endsWith("!")))
            return; // void return, to exit method
        s=s.substring(0, s.length()-1);
        String o="";
        String[] wo=s.split(" ");
        for(int j =0;j<wo.length;j++){
            for(int i =0;i<wo.length-1;i++){
                if(wo[i].length()>wo[i+1].length()){
                    String t=wo[i];
                    wo[i]=wo[i+1];
                    wo[i+1]=t;
                }
            }
        }
        for (String w : wo) {
            System.out.println(w);
        }
    }
}

class Q2{
    public static boolean checkSym(int[][] M){
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j <M[0].length; j++) {
                if(M[i][j]!=M[j][i])
                    return false;
            }
        }
        return true;
    }
    public static void main(){
        System.out.println("Enter M");
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        if(M<=2||M>=10)
            return;
        int A[][]=new int[M][M];
        System.out.println("Enter "+M*M+" numbers");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                A[i][j]=sc.nextInt();
            }
        }
        System.out.println("THE MATRIX");
        int ld=0,rd=0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                System.out.print(A[i][j]+" ");
                if(i==j)
                    ld+=A[i][j];
                if(i+j==M-1)
                    rd+=A[i][j];
            }
            System.out.println();
        }
        System.out.println("THE GIVEN MATRIX IS "+(checkSym(A)?"SYMMETRIC":"NOT SYMMETRIC"));
        System.out.println("The sum of left diagonal = "+ld);
        System.out.println("The sum of right diagonal = "+rd);
    }
}

class Q3{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t=a, c=0;
        while(t>1){
            t/=2;
            c++;
        }
        System.out.println(c);
        System.out.println("Product of two numbers is "+(b+b*((int)Math.pow(2,c))));
    }
}