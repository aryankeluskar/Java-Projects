import java.util.*;
public class coin {
    public static void main(String args[]) {
        int h=0, t=0;
      for(int i=1;i<=200;i++){
          int r = (int)(Math.random()*2);
          int k= r==1?h++:t++;
       System.out.println(i+"th coin toss result is: "+(r==1?"Head":"Tails"));
      }
      System.out.println("Heads: "+h+", Tails: "+t);
    }
}
