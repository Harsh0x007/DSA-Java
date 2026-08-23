public class allPermutaionStr {
    public static void printPerm(String str, String permutation) {
        if (str.isEmpty()) {
            System.out.print(permutation + " ");
            return;
        }

        for ( int i = 0; i<str.length(); i++) {
            char currChar = str.charAt(i);
            String remaining = str.substring(0,i) + str.substring(i + 1);
            printPerm(remaining, permutation + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        printPerm(str, "");
    }
}
