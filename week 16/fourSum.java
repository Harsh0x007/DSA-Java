import java.util.*;
public class fourSum {

    public static List<List<Integer>> brute(int arr[]) {
        Set<List<Integer>> set = new HashSet<>();
        int n = arr.length;
        for(int i = 0; i< n; i++) {
            for(int j = i+1; j<n; j++) {
                int sum = 0;
                for(int k = j+1; k<n-1; k++) {
                        sum = arr[i] + arr[j] + arr[k] + arr[k+1];
                        if(sum == 0) {
                            List<Integer> quads = Arrays.asList(arr[i],arr[j],arr[k],arr[k+1]);
                            Collections.sort(quads);
                            set.add(quads);
                        } 
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static List<List<Integer>> better(int[] arr, int target) {
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0; i<n; i++) {
            for(int j =i+1; j<n; j++) {
                Set<Integer> remain = new HashSet<>();
                for(int k = j+1; k<n; k++ ) {
                    int sum = arr[i] + arr[j];
                    sum += arr[k];
                    int fourth = target - sum;
                    if(remain.contains(fourth)) {
                        List<Integer> quads = Arrays.asList(arr[i], arr[j], arr[k], fourth);
                        Collections.sort(quads);
                        set.add(quads);
                    }

                    remain.add(arr[k]);
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> bruteAns = brute(arr);
        System.out.println(bruteAns);
    
        List<List<Integer>> betterAns = better(arr, 0);
        System.out.println(betterAns);
    }
}
