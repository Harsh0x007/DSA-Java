public class leftRotateArr {

    public static void bruteForce(int arr[], int k) {
        k = k % arr.length;
        int temp[] = new int[k];
        for(int i = 0; i<k ; i++) {
            temp[i] = arr[i];
        }

        for(int i = k; i < arr.length; i++) {
            arr[i-k] = arr[i];
        }
        for(int i = arr.length - k; i< arr.length; i++) {
            arr[i] = temp[i-(arr.length - k)];
        }
    }

    public static void optimalApp(int arr[], int k) {
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    public static void reverse(int arr[], int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7};
        // bruteForce(arr, 2);
        optimalApp(arr, 3);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
