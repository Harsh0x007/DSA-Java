public class reverseStringRec {
    public static void printReverseString(int n, String str) {
        if(n < 0) {
            return;
        }
        System.out.println(str.charAt(n));
        printReverseString(n-1, str);
    }

    public static void main(String[] args) {
        String str = "abcd";
        printReverseString(str.length()-1, str);
    }
}
