public class factorial {
    public static void printfac(int n,int ans) {
        
        if (n == 1 || n == 0) {
            System.out.println("final factorial: " + ans);
            return;
        }
        ans = ans *n;
        printfac(n-1,ans);
        
    }

    public static void main(String[] args) {
        printfac(5,1);
        
    }
}
