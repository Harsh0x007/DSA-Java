import java.util.*;
public class _3updateBit {
    public static void main(String[] args) {
        //update the 2nd bit of number n to 1 . (n = 0101).
        //2nd bit means position 1 form left side 
        int n = 5; //0101
        int pos = 1;
        int bitMask = 1<<pos;

        Scanner sc = new Scanner(System.in);
        String option = sc.next(); //clear or set
        if (option.equals("clear")) {
            int not = ~(bitMask);
            int newNum = not & n;
            System.out.print("After clearing the bit : "+ newNum);
    
        }
        else if (option.equals("set")) {
            int newNum = bitMask | n;
            System.out.print("After setting the 1: "+ newNum);
        } else {
            System.out.print("Invalid input please input either clear or set.");
        }
        sc.close();
    }

}