public class xPowerNOpt {
    public static int power(int x, int n) {
        if (n == 0){
            return 1;
        }
        int halfpower = power(x,n/2);
        int halfpowerSq = halfpower * halfpower;
        if (n % 2 != 0) {
            return halfpowerSq * x;
        }
        
        return halfpowerSq;
    }

    public static void main(String[] args) {
        int n = 2;
        int x = 3;
        System.out.print(power(x, n));
    }
}
