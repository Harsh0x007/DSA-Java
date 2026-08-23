public class maxSumSubArr {
    public static int calMaxSum(int nums[]) {
        int maxSum = nums[0];
        int currSum = 0;
        int start = 0;
        int end = 0;
        int tempStart = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > currSum + nums[i]) {
                currSum = nums[i];
                tempStart = i;
            } else {
                currSum = currSum + nums[i];
            }
            if(currSum > maxSum ) {
                maxSum = currSum;
                start = tempStart;
                end = i;
            }
        }
        System.out.print("Subarray: [ ");
        for(int i = start; i < end; i++ ) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("]");
        return maxSum;
    }
    public static void main(String[] args) {
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.print(calMaxSum(nums));
    }
}
