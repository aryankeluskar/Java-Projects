import java.util.*;

class OddEven {
    private int a[], m;

    public OddEven(int mm) {
        m = mm;
        a = new int[m];
    }

    public void fillarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + m + " numbers");
        for (int i = 0; i < m; i++)
            a[i] = sc.nextInt();
    }

    public OddEven arrange(OddEven P, OddEven Q) {
        int c = 0;
        OddEven obj = new OddEven(P.m + Q.m);
        for (int i = 0; i < P.m; i++) {
            if (P.a[i] % 2 == 1) {
                obj.a[c] = P.a[i];
                c++;
            }
        }
        for (int i = 0; i < Q.m; i++) {
            if (Q.a[i] % 2 == 1) {
                obj.a[c] = Q.a[i];
                c++;
            }
        }
        for (int i = 0; i < P.m; i++) {
            if (P.a[i] % 2 == 0) {
                obj.a[c] = P.a[i];
                c++;
            }
        }
        for (int i = 0; i < Q.m; i++) {
            if (Q.a[i] % 2 == 0) {
                obj.a[c] = Q.a[i];
                c++;
            }
        }
        return obj;
    }

    public void display() {
        System.out.println("The elements are: ");
        for (int i = 0; i < m; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter length of first array: ");
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        OddEven od1 = new OddEven(min);
        System.out.println("Enter length of second array: ");

        int nin = sc.nextInt();
        OddEven od2 = new OddEven(nin);
        od1.fillarray();
        od2.fillarray();
        OddEven res = new OddEven(min + nin);
        res = od1.arrange(od1, od2);
        res.display();

    }
}
