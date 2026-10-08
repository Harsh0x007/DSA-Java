import java.util.HashSet;

public class rmvDuplicate {
    public static boolean[] map = new boolean[26];

    public static String calcOriginal(String str, int idx, String newString) {
        if(idx == str.length()) {
            return newString;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true ) {
            return calcOriginal(str, idx+1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            return calcOriginal(str, idx+1, newString);
        }
    }

    public static void remvDuplicateFrmArrBruteForce(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<arr.length; i++) {
            set.add(arr[i]); //O(nlogn)
        }
        for(int elem : set) {
            System.out.print(elem + " "); //O(n)
        }
    }

    public static void better2pointerApporOptimal(int arr[]) {
        int i = 0;
        for(int j = 1; j< arr.length; j++) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];   // O(n)
            }
        }
        for(int k = 0; k<=i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
    public static void main(String[] args) {
        String str = "abbcada";
        int arr[] = { 1, 1, 2, 2, 2, 3, 3};
        remvDuplicateFrmArrBruteForce(arr);
        System.out.println();
        System.out.print(calcOriginal(str, 0, ""));
        System.out.println();        
        better2pointerApporOptimal(arr);
    }
}
