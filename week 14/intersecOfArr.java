import java.util.ArrayList;

public class intersecOfArr {

    public static ArrayList<Integer> intersectedArr(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0;
        ArrayList <Integer> ans = new ArrayList<>();
        while (i < n && j < m) {
            if(a[i] < b[j]) {
                i++;
            }
            else if(a[i] > b[j]) {
                j++;
            }
            else {
                ans.add(a[i]);
                i++;
                j++;
            }
        }  // T O(n+m)
        //    S O(1)
        return ans;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 3, 4, 5, 6};
        int b[] = {2, 3, 3, 5, 6, 6, 7};
        System.out.print(intersectedArr(a, b));
    }
}
