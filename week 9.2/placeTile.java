public class placeTile {
    public static int placeTheTiles(int n, int m) {
        if (n == m) {
            return 2;
        }
        if (n < m) {
            return 1;
        }
        int vertical = placeTheTiles(n-m, m);
        int horizontal = placeTheTiles(n-1, m);

        return vertical + horizontal;
    }

    public static void main(String args[]) {
        int n = 4;
        int m = 2;
        System.out.print(placeTheTiles(n, m));
    }
}
