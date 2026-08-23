
public class _0bitmanipuGet {
    public static void main(String[] args) {
        int n = 5; //0101
        int pos = 2; //3rd bit

        int bitMask = 1<<pos;
        if ((bitMask & n) == 0) {
            System.out.print("Bit was zero");
        }
        else {
            System.out.print("Bit was one");
        }
    }
}
