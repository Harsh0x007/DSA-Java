public class xorSubArrasK {

    public static int brute(int arr[], int k) {
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
            int xor = 0;
            for(int j =i; j < arr.length; j++) {
                xor = xor ^ arr[j];
                if(xor == k) count++;
                }
            }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(brute(arr, k));
    }
}


