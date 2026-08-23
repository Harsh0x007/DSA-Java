import java.util.HashSet;

public class containsDupl {
    public static boolean arrContainsDup(int nums[]) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {

            if(set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {0, 2, 3, 1};
        System.out.print(arrContainsDup(nums));
    }
}
