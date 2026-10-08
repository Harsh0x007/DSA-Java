public class mergeSortStriver {

    public static void divide(int arr[], int low, int high) {
        if(low >= high) {
            return;
        }
        int mid = low + (high - low)/2;
        divide(arr, low, mid);
        divide(arr, mid+1, high);
        merge(arr, low, mid, high);

    }

    public static void merge(int arr[], int low, int mid, int high) {
        int right = mid + 1;
        int temp[] = new int[high - low + 1];
        int k = 0;
        int left = low;

        while( left <= mid && right <= high) {
            if(arr[left] <= arr[right]) {
                temp[k] = arr[left];
                k++;
                left++;
            } else {
                temp[k] = arr[right];
                k++;
                right++;
            }
        }
        while(left <= mid) {
            temp[k] = arr[left];
            k++;
            left++;
        }
        while(right <= high ) {
            temp[k] = arr[right];
            k++;
            right++;
        }

        for(int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    public static void main(String args[]) {
        int arr[] = {3, 5, 2, 9, 1, 3, 6};
        divide(arr, 0, arr.length-1);
        for(int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
