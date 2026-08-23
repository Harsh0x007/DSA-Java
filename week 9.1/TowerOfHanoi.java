public class TowerOfHanoi {
    public static void printStepsForDest(int n, String source, String helper, String des) {
        if (n==1){
            System.out.println("move disk 1 from " + source + " to  " + des);
            return;
        }

        printStepsForDest(n-1, source, des, helper);
        System.out.println("Move disk" + n + " from " + source + " to " + des);
        printStepsForDest(n-1, helper, source, des);
    }
    public static void main(String[] args) {
        int n = 3;
        printStepsForDest(n, "Src", "Helpr", "Dest");
    }
}
