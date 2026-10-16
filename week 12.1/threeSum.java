import java.util.*;

import java.util.List;
public class threeSum {
    public static void calc3Sum(int nums[]) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum < 0) {
                    left++;
                } else if (sum > 0) {
                    right--;
                } else {
                    System.out.println(nums[i] + " " + nums[left] + " " + nums[right]);
                    
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                    }
            }
        }
    }

    public static List<List<Integer>> betterApp(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        
        for(int i = 0; i< nums.length; i++) {
            Set<Integer> set = new HashSet<>();
            for(int j = i+1; j<nums.length; j++){
            int remained = -nums[i] - nums[j];
            if(set.contains(remained)) {
                List<Integer> triplet = Arrays.asList(nums[i], nums[j], remained);
                Collections.sort(triplet);
                ans.add(triplet);
            } else {
                set.add(nums[j]);
            }
        }
        }
        return new ArrayList<>(ans);

    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        calc3Sum(nums);
        List<List<Integer>> ans = betterApp(nums);
        System.out.print(ans);
    }
}
