public class rightRotateArr {

    public static void rotatedArr(int arr[], int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        
    }
    public static void reverse(int arr[], int left, int right) {
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++; 
            right--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7};
        rotatedArr(arr, 3);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
