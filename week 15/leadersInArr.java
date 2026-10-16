import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class leadersInArr {

    public static List<Integer> optimal(int arr[], int n) {
        List<Integer> ans = new ArrayList<>();
        int max = arr[n-1];
        ans.add(max);
        for(int i = n-2; i >=0; i--) {
            if(arr[i] > max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ans);
        return ans;
    }

    public static List<Integer> bruteForce(int arr[], int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<n; i++) {
            boolean leader = true;
            for(int j = i+1; j < n; j++) {
                if(arr[i] < arr[j]) {
                    leader = false;
                }
            }
            if(leader) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = { 10, 22, 12, 3, 0, 6 };
        System.out.println(bruteForce(arr, arr.length));
        System.out.print(optimal(arr, arr.length));
    }

}
