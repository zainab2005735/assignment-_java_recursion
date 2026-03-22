public class Main {
    public static void main(String[] args){
        printDigits(84);
    }
    public static void printDigits(int n){
        
        if (n<10) {
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }
}