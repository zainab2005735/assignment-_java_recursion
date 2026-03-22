public class Main {
    public static void main(String[] args){
        
        prime(13, 13/2);
        prime(4, 4/2);
    }
    public static void prime(int n, int i) {
        if (n <= 1) {
            System.out.println("Composite");
            return;
        }
        if (i == 1) {
            System.out.println("Prime");
            return;
        }
        if (n % i == 0) {
            System.out.println("Composite");
            return;
        }
    
        prime(n, i - 1);
    }
}