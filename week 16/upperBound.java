public class upperBound {

    public static int getupperBound(int arr[], int target) {
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low <= high) {
            int mid = low+ (high - low)/2;
            
            if(arr[mid] > target) {
                ans = mid;
                high = mid -1;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int arr[] = {2,3,6,7,8,11,11,11,12};
        int target = 6;
        System.out.print(getupperBound(arr, target));
    }
}
