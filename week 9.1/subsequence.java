public class subsequence {
    public static void calcSubSequenc(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.print(newString + " ");
            return;
        }
        char currChar = str.charAt(idx);
        calcSubSequenc(str, idx+1, newString + currChar);

        calcSubSequenc(str, idx+1, newString);
        return ;
    }
    public static void main(String[] args) {
        String str = "abc";
        calcSubSequenc(str, 0, "");
    }
}
