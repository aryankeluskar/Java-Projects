import java.util.*;
class pro_or_loss
{   
    public static void main(){
        System.out.print('\u000C');        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter SP then CP");
        double sp = sc.nextDouble();
        double cp = sc.nextDouble();
        System.out.println("The "+((sp>cp)?"Profit":"Lost")+" Percent is "+(((((sp>cp)?sp-cp:cp-sp))/cp)*100));
        sc.close();
    }
}
