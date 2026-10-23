public class lowerBound {
    public static int lowerBoundans(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int ans  = -1;
        while(low<= high) {
            int mid = low + (high - low)/2;
            if(nums[mid] >= target) {
                ans = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 30, 40, 45, 50, 60, 70, 80};
        System.out.print(lowerBoundans(arr,35));
    }

}
