import java.util.HashMap;
public class noFrequency {

    public static int printCountOfN(int n, int arr[], HashMap<Integer,Integer> map) {
        
        for(int i = 0; i < arr.length; i++ ) {
            int key = arr[i];
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1 );
            } else {
                map.put(key, 1);
            }
        }
        if( !map.containsKey(n)) return 0;
        return map.get(n);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 1, 3};
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = 5;
        System.out.print(printCountOfN(n, arr, map));
    }
}
