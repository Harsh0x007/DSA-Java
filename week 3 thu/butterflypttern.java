public class butterflypttern {
    public static void main(String[] args) {
        int n = 4;
        for ( int i = 1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            int formula = n-i;
            for(int j = 1; j<=2*formula; j++) {
                System.out.print(" ");
            }

            for(int j = 1; j<=i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for( int i = n;i>=1; i--) {
            int formula = n - i;
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j<=2*formula; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j<=i; j++) {
                System.out.print('*');
            }
            System.out.println();

        }
    }
}
