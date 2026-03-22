public class Main {
    public static void main(String[] args){

        int[] l = {8, 7, 6 ,9, 10};
        double avg = theAverage(l);
        System.out.println("Average: " + avg);
    }

    public static int sumofList(int[] list, int b) {
        if (b == list.length) {
            return 0;
        }
        return list[b] + sumofList(list, b + 1);
    }

    public static double theAverage(int[] list) {
        int total = sumofList(list, 0);
        return (double) total / list.length;
    }
}