public class IIndLargElmntArr {

    public static void betterApproach(int arr[]) {
        int largest = arr[0];
        for(int i = 0; i< arr.length; i++) {
            if(arr[i] >= largest) {
                largest = arr[i];
            }
        }
        //for second largest 
        int secLargest = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= secLargest && arr[i] != largest) {
                secLargest = arr[i];
            }
        }
        System.out.println(secLargest);

    }

    public static void optimalApp(int arr[]) {
        int largest  = arr[0];
        int sLargest = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++) {
            if(arr[i] > largest ) {
                sLargest = largest;
                largest = arr[i];
            } 
            else if( arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
            //
            // else if( arr[i] != largest && arr[i] > sLargest) {
            //     sLargest = arr[i];
            // }
        }
        System.out.println(sLargest);
    }


    public static void IIndSmallestOptimal(int arr[]) {
        int smallest = arr[0];
        int secSmallest = Integer.MAX_VALUE;
        for(int i = 1; i< arr.length; i++) {
            if(arr[i] < smallest) {
                secSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] > smallest && arr[i] < secSmallest) {
                secSmallest = arr[i];
            }
            //second way for same else if cond
            // else if(arr[i] != smallest && arr[i] < secSmallest) {
            //     secSmallest = arr[i];
            // }
        }
        System.out.println("Second Smallest in Array:" + secSmallest);
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 7, 7, 5};
        betterApproach(arr);
        System.out.println("-------------------");
        optimalApp(arr);
        System.out.println("--------------------");
        IIndSmallestOptimal(arr);
    }
}
