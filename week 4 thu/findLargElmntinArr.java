public class findLargElmntinArr {

    public static void bruteForce(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n -i - 1; j++) {
                if(arr[j] >= arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int largest = arr[n-1];
        System.out.println("Largest Element through buble sort bruteForce: " + largest);
    }

    public static void optimalSol(int arr[]) {
        int largest = arr[0];
        for( int i = 0; i < arr.length-1; i++) {
            if(arr[i] >= largest) {
                largest = arr[i];
            }
        }
        System.out.print(largest);
    }
    public static void main(String[] args) {
        int arr[] = { 2, 5, 9, 1, 4, 3, 7};
        bruteForce(arr); // O(nlogn)
        System.out.println("------optimal------");
        optimalSol(arr); //O(n)
    }
}
