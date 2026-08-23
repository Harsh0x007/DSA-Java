public class remvDup {
    public static int removeDuplicates(int nums[]) {
        int unique = 0;
        if (nums.length == 0 ) {
            return 0;
        }
        for(int read=1; read< nums.length; read++) {
            if (nums[unique]!= nums[read]) {
                unique++;
                nums[unique] = nums[read];
            }
        }
        return unique+1;
    }

    public static void main(String args[]) {
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.print(removeDuplicates(nums));
    }
}
