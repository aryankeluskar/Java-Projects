import java.util.*;

public class C11_PrePRACTICAL_EXAM {
    public static void main(String[] args){
        Q1.main();
        // Q2.main();
        // Q3.main();
    }
}

class Q1{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int L = s.length();
        if( L<4 || L>99 ){
            System.out.println("INVALID LENGTH");
            return; // void return, to exit method
        }
        for (int i = 0; i < L; i++) {
            char c = s.charAt(i);
            if(!Character.isLetter(c)){
                System.out.print(c);
                continue;
            }
            if(c>='A'&&c<='M')
                c+=13;
            if(c>='a'&&c<='m')
                c+=13;
            if(c>='n'&&c<='z')
                c-=13;
            if(c>='N'&&c<='Z')
                c-=13;
            System.out.print(c);
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