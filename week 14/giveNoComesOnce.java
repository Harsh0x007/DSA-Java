import java.util.HashSet;

public class giveNoComesOnce {

    public static void noAppearedOnce(int nums[]) {
        for(int i =0; i< nums.length; i++) {
            int num = nums[i];
            int count = 0;
            for(int j = 0; j < nums.length; j++) {
                if(nums[j] == num) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.print(num);
                return;
            }
        }
    }
    
    public static int betterApproach(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums) {
            if(set.contains(num)){
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 3, 3, 4, 4};
        noAppearedOnce(nums);
        System.out.println();
        System.out.println(betterApproach(nums));
    }
}
