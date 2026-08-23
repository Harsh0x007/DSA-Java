public class mergeSort {

    public static void divide(int arr[], int start, int end) {
        
        if(start >= end) {
            return;
        }
        int mid = start + (end - start)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);

        merge(arr, start, mid, end);


    }

    public static void merge(int arr[], int start, int mid, int end) {
        int i = start;
        int j = mid+1;
        int temp[] = new int[end - start + 1];
        int k = 0;

        while(i <= mid && j <= end) {
            if(arr[i] >= arr[j]) {
                temp[k] = arr[j];
                j++;
                k++;
            } else {
                temp[k] = arr[i];
                i++;
                k++;
            }
        }

        while(i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while(j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for(int itr = 0; itr< temp.length; itr++) {
            arr[start + itr] = temp[itr];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        divide(arr, 0, n-1);
        for(int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
