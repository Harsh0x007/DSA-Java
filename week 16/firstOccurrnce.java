public class firstOccurrnce {

    public static int getans(int[] arr, int target) {
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<= high) {
            int mid = low + (high-low)/2; 
            if(target == arr[mid]) {
                ans = mid;
                high = mid-1;
            }
            else if(target > arr[mid]) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 6, 7, 12, 12, 16, 17};
        System.out.print(getans(arr,12));
    }
}
