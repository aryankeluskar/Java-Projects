public class rand_input{
    public static int[] ran(int s, int e, int num){
        int arr[]=new int[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=((int)(Math.random()*(e-s)))+s;
        }
        return arr;
    }

    public static long[] ranl(int st, int e, int num){
        long arr[]=new long[num];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=((int)(Math.random()*(e-st)))+st;
        }
        return arr;
    }

    public static String[] ran(int num){
        String arr[]=new String[num];
        char vw[]={'a','e','o','u','i','n','t','s'};
        for(int i=0;i<arr.length;i++){
            String sw="";
            for(int j=0;j<5+(int)(Math.random()*10);j++){
                if(j%2==0)
                    sw+=(char)(97+(int)(Math.random()*26));
                else 
                    sw+=(char)(vw[(int)(Math.random()*vw.length)]);
            }
            arr[i]=sw;
        }
        return arr;
    }
    
    
}