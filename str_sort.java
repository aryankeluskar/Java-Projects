import java.util.*;
class str_sort
{
    static String[] b_sort(String s[]){
        String t="";
        for(int i=0;i<s.length;i++)
        {
            for(int j=0;j<s.length-1;j++){
                if(sorted.isSorted(s)){               
                    break;
                }
                if(s[j].compareToIgnoreCase(s[j+1])>0)
                {
                    t=s[j];
                    s[j]=s[j+1];
                    s[j+1]=t;
                }
            }
        }
        return s;
    }

    static String[] s_sort(String s[]){
        for(int i=0;i<s.length;i++)
        {
            String small=s[i];
            int sidx=i;
            for(int j=i+1;j<s.length;j++)
            {
                if(small.compareToIgnoreCase(s[j])>0)
                {
                    small=s[j];
                    sidx=j;
                }
            }
            String t=s[i];
            s[i]=s[sidx];
            s[sidx]=t;
        }
        return s;
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size then array");
        int si = sc.nextInt();
        String s[] = new String[si];
        for(int i = 0;i<si;i++)
            s[i]=sc.nextLine();
    }
}