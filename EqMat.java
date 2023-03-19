import java.util.*;

class EqMat {
    int m, n, a[][];

    public EqMat(int mm, int nn) {
        m = mm;
        n = nn;
        a=new int[m][n];
    }

    public void readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter " + m * n + " elements");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public int check(EqMat P, EqMat Q) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (P.a[i][j] != Q.a[i][j])
                    return 0;
            }
        }
        return 1;
    }

    public void print() {
        System.out.println("\nelements of array are: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the dimensions");
        Scanner sc = new Scanner(System.in);
        int min=sc.nextInt();
        int nin=sc.nextInt();
        EqMat eq1=new EqMat(min, nin);
        eq1.readArray();
        EqMat eq2=new EqMat(min, nin);
        eq2.readArray();
        eq1.print();
        eq2.print();
        if(eq1.check(eq1, eq2)==1){
            System.out.println("both are equal");
        }
        else
            System.out.println("not equal");
    }
}