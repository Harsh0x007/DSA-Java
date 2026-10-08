public class nSum {

    public static void parameterizedPrintSum(int i,int sum) {
        if(i < 1) {
            System.out.println(sum);
            return;
        }
        parameterizedPrintSum(i-1, sum +i);
    }

    public static int unParameterizedPrintSum(int n) {
        if ( n == 0) {
            return 0;
        }
        return n + unParameterizedPrintSum(n-1);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.print(unParameterizedPrintSum(n));

    }
}