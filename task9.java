public class task9 {
    public static void main(String[] args){

        System.out.println(Total("recursion", 0));
    }
    public static int Total(String s, int i) {
        if (s == null) return 0;
        if (i == s.length()) return 0;
        return 1 + Total(s, i + 1);
    }
}