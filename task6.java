public class task6 {
    public static void main(String[] args){

        System.out.println("4^5 is "+a_n(4, 5));
    }
    public static int a_n(int a, int n){

        if(n==0) return 1;
        return a*a_n(a, n-1);
    }
}