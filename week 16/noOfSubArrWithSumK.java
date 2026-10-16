


public class noOfSubArrWithSumK {
    
    public static int bruteSubArrSum(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i<nums.length; i++) {
            for(int j = i; j< nums.length; j++) {
                int sum =0;
                for(int x = i; x <= j; x++) {
                    sum += nums[x];
                }
                if(sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;
        System.out.print(bruteSubArrSum(nums, k));
    }   
    }
