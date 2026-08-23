public class checkArrayOrder {
    public static boolean isOrder(int arr[], int i) {

        if(i == arr.length -1){
            return true;
        }
        if( arr[i] >= arr[i+1]) {
            return false;
        }
        boolean ans = isOrder(arr, i+1);
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 4, 5};
        int i = 0;
        System.out.print(isOrder(arr, i));
    }
}
