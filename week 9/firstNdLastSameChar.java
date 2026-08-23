public class firstNdLastSameChar {
    public static void printOccurence(String str, int n, char element, int first, int last) {

        if(n == str.length()) {
            System.out.print(first + " ");
            System.out.print(last);
            return;
        }

        char currChar = str.charAt(n);
        if(currChar == element) {
            if (first == -1) {
                first = n;
                last = n;
            } else {
                last = n;
            }
        }
        printOccurence(str, n+1, element, first, last);

    }
    
    public static void main(String[] args) {
        String str = "abcd";
        int first = -1;
        int last = -1;
        printOccurence(str, 0, 'd', first, last);
    }
}
