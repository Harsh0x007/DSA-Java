public class movezerosToEnd {
    public static void moveZeros(int[] nums) {
        int pos = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = temp;
                pos++;
            }
        }
        System.out.print("nums: [ ");
        for(int i = 0; i< nums.length; i++) {
            
            System.out.print(nums[i] + " ");

        }
        System.out.print("]");
    }
    public static void main(String[] args) {
        int nums[] = { 0, 1, 0, 3, 12};
        moveZeros(nums);
    }
}
