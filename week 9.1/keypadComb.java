public class keypadComb {
    public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printComb(String str, int idx, String combinationString) {
        if( idx == str.length()) {
            System.out.print(combinationString + " ");
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];
        for(int i = 0; i<mapping.length(); i++) {
            char currchoice  = mapping.charAt(i);
            printComb(str, idx+1, combinationString + currchoice);
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printComb(str, 0, "");
    }
}
