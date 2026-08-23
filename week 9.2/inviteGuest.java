public class inviteGuest {
    public static int noOfWaysPair(int n) {
        if(n <= 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        

        int ways1 = noOfWaysPair(n-1);

        int ways2 = (n-1) * noOfWaysPair(n-2);
        return ways1 + ways2;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.print(noOfWaysPair(n));
    }
}
