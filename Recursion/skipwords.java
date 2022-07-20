public class skipwords {
    public static void main(String[] args) {
        System.out.println(skip("helloashhello"));
    }

    public static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (up.startsWith("ash")) {
            return skip(up.substring(3));
        } else {
            return ch + skip(up.substring(1));
        }
    }
}
