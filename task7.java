public class task7 {
    public static void main(String[] args){

        int[] list1 = {1, 2, 3, 4, 5};
        RevOrder(0, list1);
    }
    public static void RevOrder(int n, int[] list){

        if (n==list.length) return;
        
        RevOrder(n+1, list);
        System.out.println(list[n]);
    }
}