public class rmvDuplicate {
    public static boolean[] map = new boolean[26];

    public static String calcOriginal(String str, int idx, String newString) {
        if(idx == str.length()) {
            return newString;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true ) {
            return calcOriginal(str, idx+1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            return calcOriginal(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbcada";
        System.out.print(calcOriginal(str, 0, ""));
    }
}
