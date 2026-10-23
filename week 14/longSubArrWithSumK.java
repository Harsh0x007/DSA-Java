import java.util.HashMap;

public class longSubArrWithSumK {
    public static int getLongestSubArr(int[] nums, int k) {
        int left = 0, right = 0;
        int maxLength = 0;
        int currSum = 0;

        while (right < nums.length) {
            currSum += nums[right];
            while (left <= right && currSum > k) {
                currSum -= nums[left];
                left++;
            }
            if (currSum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
        }

        return maxLength;
    }

    public static int brute(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;
        int len = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int x = i; x < j; x++) {
                    sum = sum + arr[k];
                    if (sum == k) {
                        len = j - i + 1;
                        maxLength = Math.max(maxLength, len);
                    }
                }
            }
        }
        return maxLength;
    }

    public static int optimal(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = i + 1;
            }
            int needed = sum - k;
            if (map.containsKey(needed)) {
                int len = i - map.get(needed);
                maxLen = Math.max(maxLen, len);
            }
            map.putIfAbsent(sum, i);
        }
        return maxLen;
    }

    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 1, 1, 1, 1, 4, 2, 3 };
        int k = 3;
        // System.out.print(getLongestSubArr(nums, k));
        System.out.print(brute(nums, k));
    }
}
