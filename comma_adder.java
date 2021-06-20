class comma_adder
{
    public static String it(int n){
        String s=Integer.toString(n);
        if(n<1000)
            return s;
        else{
            String d="";
            String c="";
            for(int i=s.length()-5;i>-1;i-=2){
                c+=s.charAt(i+1);
                c+=s.charAt(i);
                c+=",";
            }
            
            for(int i=c.length()-1;i>=0;i--)
                d+=c.charAt(i);
            d=d.substring(1);
            d+=",";    
            d+=s.substring(s.length()-3);
            return d;
        }
    }
    public static String it(long n){
        String s=Long.toString(n);
        if(n<1000)
            return s;
        else{
            String d="";
            String c="";
            for(int i=s.length()-5;i>-1;i-=2){
                c+=s.charAt(i+1);
                c+=s.charAt(i);
                c+=",";
            }
            
            for(int i=c.length()-1;i>=0;i--)
                d+=c.charAt(i);
            d=d.substring(1);
            d+=",";    
            d+=s.substring(s.length()-3);
            return d;
        }
    }
}