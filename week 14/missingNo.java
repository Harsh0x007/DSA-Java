
public class missingNo {

    public static int optimal(int arr[]) {
        int n = arr.length+1;
        int xOR1 = 0;
        int xOR2 = 0;
        
        for(int i = 0; i < arr.length; i++) {
            xOR1 = xOR1 ^ (i+1);
            xOR2 = xOR2 ^ arr[i];
        }
        xOR1 = xOR1^n;
        return xOR1 ^ xOR2;
        //T O(n), S O(1)
    }

    public static int betterApproach(int arr[]) {
        int n = arr.length + 1 ;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
        //T O(n) , S O(1)
    }

    public static int bruteforcegetMissingVal(int arr[]) {
        int n = arr.length;

        for (int i = 1; i <= n; i++) {
            int flag = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    flag = 1;
                    break;
                }

            }
            if (flag == 0) {
                return i;
            }
        }
        return -1;
        // O(n*n)  O(1)
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5 };
        System.out.print(bruteforcegetMissingVal(arr));
        System.out.println();
        System.out.println(betterApproach(arr));
        System.out.println("optimal: " + optimal(arr));
    }
}
