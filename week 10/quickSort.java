import java.util.Stack;

public class quickSort {

    public static void quickSort(int arr[], int start, int end) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        stack.push(end);
        while(!stack.isEmpty()) {
            int currentEnd = stack.pop();
            int currentStart = stack.pop();

            if(currentStart>= currentEnd) {
                continue;
            }
        }
    }

    public static void recursQuickSort(int arr[], int start, int end) {
        if(end <= start) {
            return;
        }
        int pivot = partition(arr, start, end);
        recursQuickSort(arr, start, pivot - 1);
        recursQuickSort(arr, pivot + 1, end);
    }

    public static int partition(int arr[], int start, int end) {
        int i = start - 1;
        int pivot = arr[end];

        for(int j = start; j<=end-1; j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 5, 8, 9 };
        int n = arr.length - 1;
        recursQuickSort(arr, 0, n);
        for(int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
