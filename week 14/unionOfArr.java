import java.util.ArrayList;
import java.util.HashSet;

public class unionOfArr {

    public static void bruteForce(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i : arr2) {
            set.add(i);
        }
        for (int i : set) {
            System.out.print(i + " ");
        }
        //O(n + m) average
        // space also same
    }

    public static void doublePointerApp(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;
        ArrayList<Integer> union = new ArrayList<>();
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
        }
        while (i < n1) {
            if (union.size() == 0 || !union.contains(arr1[i])) {
                union.add(arr1[i]);
            }
            i++;
        }
        while (j < n2) {
            if (union.size() == 0 || !union.contains(arr2[j])) {
                union.add(arr2[j]);
            }
            j++;
        }
        for (Integer elem : union) {
            System.out.print(elem + " ");
        }
        //O(n+m)
        //O(n+m) only for output printing
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 3, 4, 4, 5, 6 };
        // bruteForce(arr1, arr2);
        doublePointerApp(arr1, arr2);
    }
}