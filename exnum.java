class exnum
{
    public static int extract(long n, int i){
        return Integer.parseInt(Character.toString((Long.toString(n)).charAt(i)));
    }
    public static int extract(int n, int i){
        return Integer.parseInt(Character.toString((Integer.toString(n)).charAt(i)));
    }
}