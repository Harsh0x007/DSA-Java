import java.util.Scanner;

public class arrayIndexFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        

        for (int i = 0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the number to find its index: ");
        int num = sc.nextInt();
        for (int i=0; i<size; i++) {
            if(numbers[i] == num) {
                System.out.print("Index of " + numbers[i] + " is " + i);
            }
        }
    }
}
