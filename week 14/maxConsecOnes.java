public class maxConsecOnes {

    public static void getNoOfOnes(int nums[], int n){
        int highest = 0;
        int count=0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 1) {
                count++;
                if(count > highest) {
                    highest = count;
                }
            }
            else if(nums[i] != 1) {
                count = 0;
                
            }
            
        }
        highest = count;
        System.out.print(highest);
    }
    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1};
        getNoOfOnes(nums, nums.length);
    }
}
