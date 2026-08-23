import java.util.ArrayList;

public class subsetofNnos {
    public static void printSubset(int n, int idx, ArrayList<Integer> subset) {
        if (idx > n) {
            System.out.print(subset + ", ");
            return;
        }
        int currNo = idx;
        subset.add(currNo);
        printSubset(n, idx+1, subset);
        subset.remove(subset.size()-1);
        printSubset(n, idx+1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        printSubset(n, 1, subset);
    }
}
