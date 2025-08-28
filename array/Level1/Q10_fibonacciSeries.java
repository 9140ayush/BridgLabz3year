public class Q10_fibonacciSeries {

    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        printFibonacci(10); // 0 1 1 2 3 5 8 13 21 34
    }
}
