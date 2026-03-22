public class task10 {
    public static void main(String[] args){

        System.out.println("Greatest common divisor is "+ gcd(136, 16));
    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}