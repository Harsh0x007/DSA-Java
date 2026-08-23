import java.util.Arrays;

public class prodOfArray {
    public static int[] printProd(int nums[]) {
        int result[] = new int[nums.length];
        int prodLeft = 1;
        int prodRight = 1;
        for( int i = 0; i< nums.length; i++) {
            result[i] = prodLeft;
            prodLeft = prodLeft * nums[i];
            
        }
        for( int i = nums.length -1; i >= 0; i--) {
            result[i] = result[i] * prodRight;
            prodRight = prodRight * nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.out.print(Arrays.toString( printProd(nums)));
    }
}
