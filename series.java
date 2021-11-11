class series{
    public static void main(String[] args){
        System.out.println("a: ");
        float n =1;
        for(int i=1;i<=8;i++){
            System.out.print((int)n+", ");
            n*=10;n+=1;
        }
        System.out.println("\n\nb: ");
        n=0.3f;
        for(int i=1;i<=8;i++){
            System.out.print(n+", ");
            n/=10;n+=0.3;
        }
    }
}