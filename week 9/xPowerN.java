public class xPowerN {
    public static int power(int x,int n) {
        if (n == 0){
            return 1;
        }
        int xPowerNMinus1 = x * power(x,n-1);
        return xPowerNMinus1;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        System.out.print(power(x, n));
    }
}
