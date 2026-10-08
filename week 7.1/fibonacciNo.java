public class fibonacciNo {

    public static int printFibonacciVal(int n) {
        if( n <= 1 ) return n;
        return printFibonacciVal(n - 1) + printFibonacciVal(n-2);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.print(printFibonacciVal(n));
    }
}
