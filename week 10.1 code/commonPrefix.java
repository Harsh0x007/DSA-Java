public class commonPrefix {
    public static String printSameChar(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        if (strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length()) {
                    return prefix.toString();
                } else {
                    if (strs[0].charAt(i) != strs[j].charAt(i)) {
                        return prefix.toString();
                    }
                }
            }
            prefix.append(strs[0].charAt(i));
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        String strs[] = { "flower", "flow", "flight" };
        System.out.print(printSameChar(strs));
    }
}
