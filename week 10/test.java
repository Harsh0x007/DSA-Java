// public class test {
//     public static void print(String x) {
//         System.out.println(x);
//     }

//     public static void main(String[] args) {
//         String s = "";

//         for(int i = 0; i < 3; i++) {
//             print(s + i);
//             System.out.println("After print: " + s); // 0 1 2 
//         }
//     }
// }

public class test {
    public static void main(String[] args) {
        String s = "";

        for(int i = 0; i < 3; i++) {
            s = s + i;
            System.out.println("Inside loop: " + s); //0  01 012
        }

        System.out.println("Final: " + s);
    }
}