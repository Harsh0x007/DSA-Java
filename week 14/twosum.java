import java.util.Arrays;
import java.util.HashMap;
public class twosum {

    public static int[] getSum(int arr[], int n, int target) {
        for(int i = 0; i< n; i++) {
            for(int j = i +1; j<n; j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[] {arr[i],arr[j]};
                }
            }
            
        }
        return new int[] {-1,-1};
    }

    public static int[] BetterAppr(int[] arr, int n, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i< n; i++) {
            int rem = target - arr[i];
            if(map.containsKey(rem)) {
                return new int[] {rem, arr[i]};
            }

            map.put(arr[i],i);
        }

        return new int[] {-1, -1};

    }

    public static String optimal(int arr[], int n, int target) {
        Arrays.sort(arr);
        int left = 0, right = n-1;
        while(left < right) {
            if(arr[left] + arr[right] == target){
                return "yes";
            }
            else{
                if(arr[left]+ arr[right] < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return "no";
    }
    public static void main(String[] args) {
        int arr[] = {2, 6, 5, 8, 11};
        int target = 14;
        // System.out.print(Arrays.toString(getSum(arr, arr.length, target)));
        // System.out.print(Arrays.toString(BetterAppr(arr,arr.length, target)));

        System.out.print(optimal(arr, arr.length, target));
    }
}
