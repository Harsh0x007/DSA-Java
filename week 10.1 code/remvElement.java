public class remvElement {
    public static int removedElements(int nums[],int val) {
        int remaining = 0;
        if(nums.length == 0) {
            return 0;
        }
        for(int read = 0; read<nums.length; read++) {
            if(nums[read] != val) {
                nums[remaining]=nums[read];
                remaining++;
            }
        }
        return remaining;
    }

    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 2, 3, 0, 4, 2};
        System.out.print(removedElements(nums, 2));
    }
}
