public class _2clearBitMask {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;

        int not = ~(bitMask);
    
        int newNum = not & n;
        System.out.print(newNum);
    }
}
