public class Main {
    public static void main(String[] args){

        System.out.println("5! is "+ fact(5));
    }
    public static int fact(int n){

        if(n==0) return 1;
        return n*fact(n-1);
    }
}