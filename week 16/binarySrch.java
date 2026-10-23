public class binarySrch {

    public static int getval(int arr[],int target, int low, int high) {
        if(low > high) return -1;
        int mid = low + (high - low) /2;


        if(arr[mid] == target) return mid;
        else if ( target> arr[mid]) {
            return getval(arr, target, mid+1, high);
        }
        return getval(arr, target, low, mid-1);
    }
    public static void main(String[] args) {
        int arr[] = {3, 4, 6, 7, 9, 12, 16, 17};
        System.out.print(getval(arr,16, 0, arr.length-1));
    }
}
