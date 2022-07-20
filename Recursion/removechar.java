public class removechar {
    public static void main(String[] args) {
        sol("", "aabddabdgabdajj");
    }

    public static void sol(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            sol(p, up.substring(1));
        } else {
            sol(p + ch, up.substring(1));
        }
    }
}
