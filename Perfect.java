import java.util.*;

class Perfect{
    private int num;
    public Perfect(int nn){
        num=nn;
    }
    public int sum_of_factors(int i){
        if(i==1)
            return 1;
        if( num%i==0 )
            return i+sum_of_factors(i-1);
        else
            return sum_of_factors(i-1);
    }
    public void check() {
        System.out.println("Sum of factors of "+num+ " is "+sum_of_factors(num));
    }   
    public static void main(String[] args) {
        Perfect prf = new Perfect(1000);
        prf.check();
    }
}