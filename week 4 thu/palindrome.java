
public class palindrome {

    public static boolean isPalindrom(String arr, int i) {
        int n = arr.length();
        if(i >= n/2) {
            return true;
        }
        if(arr.charAt(i) != arr.charAt(n-i-1)) {
            return false;
        }
        return isPalindrom(arr, i+1);
    }
    public static void main(String[] args) {
        String str = "MaDaM";
        System.out.print(isPalindrom(str, 0));

    }
}
