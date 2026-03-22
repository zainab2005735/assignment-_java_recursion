public class task8 {
    public static void main(String[] args){

        System.out.println(isOnlyDigits("12312", 0));
        System.out.println(isOnlyDigits("123a12", 0));
    }
    public static String isOnlyDigits(String s, int i){
        if (i==s.length()) return "Yes";
        if (Character.isDigit(s.charAt(i))) return isOnlyDigits(s, 1+i);
        return "No";
    }
}