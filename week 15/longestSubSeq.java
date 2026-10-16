
import java.util.Arrays;
import java.util.HashSet;

public class longestSubSeq {

    public static boolean linearSrch(int arr[], int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static int bruteForce(int arr[], int n) {
        int count = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            x = arr[i];
            count = 1;
            while (linearSrch(arr, x + 1) == true) {
                x = x + 1;
                count += 1;
            }
        }
        return count;
    }

    public static int betterApp(int arr[], int n) {
        if (n == 0)
            return 0;

        Arrays.sort(arr);

        int longest = 1;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                continue; // Ignore duplicates
            }

            if (arr[i] == arr[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }

    public static int optimalApp(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        if (n == 0)
            return 0;
        int longest = 1;
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        for (int num : set) {
            if (set.contains(num - 1) == false) {
                int count = 1;
                int x = num;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    count += 1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = { 102, 4, 100, 1, 101, 3, 2, 1, 1 };
        System.out.println(bruteForce(arr, arr.length));

        System.out.println(optimalApp(arr, arr.length));
    }
}
