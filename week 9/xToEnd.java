public class xToEnd {
    public static String calcXnPrint(String str, int count,int n, String newString) {
        if(n == str.length()) {
            for(int i = 0; i < count; i++) {
                newString += "x";
            }
            return newString;
        }
        char currChar = str.charAt(n);
        if(currChar != 'x') {
            
            return calcXnPrint(str, count, n+1, newString + currChar);
        }
        return calcXnPrint(str, count + 1, n+1, newString);
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        int count = 0;
        int n = 0;
        String newString = "";
        System.out.print(calcXnPrint(str, count, n, newString));
    }

}
