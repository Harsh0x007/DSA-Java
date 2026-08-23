public class srchInsrtPosi {
    public static int calcPosi(int nums[], int target, int low, int high) {
        
        if( low > high) {
            return low;
        }
        int mid = low + (high - low) / 2;
        if(nums[mid] == target) {
            return mid;
        }
        if(target < nums[mid]) {
            high = mid - 1;
            return calcPosi(nums, target, low , high);
        }
        low = mid + 1;
        
        return calcPosi(nums, target, low , high);
    }

    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 6};
        int low = 0;
        int high = nums.length - 1;
        System.out.print(calcPosi(nums, 0, low, high));
    }
}