public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder  sb = new StringBuilder("harsh");
        System.out.println(sb);

        sb.setCharAt(0,'p');
        System.out.println(sb);

        System.out.println(sb.insert(2,'n'));

        sb.delete(2,4);
        System.out.println(sb);
    }
}
