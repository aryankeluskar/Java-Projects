package Class_11;
/**
 * Write a description of class so here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class so
{
    public static void pln(String s){
        System.out.println(s);
    }
    public static void p(String s){
        System.out.print(s);
    }
    public static void pln(int s){
        System.out.println(s);
    }
    public static void pln(double s){
        System.out.println(s);
    }
    public static void pln(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public static void pln(int[][] mat){
        for(int i =0;i<mat.length;i++){
            for(int j =0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            // TimeUnit.SECONDS.sleep(0.1);
            System.out.println();
        }
    }
    public static void pln(){
        System.out.println();
    }
    public static void cls(){
        System.out.print('\u000C');
    }
}
