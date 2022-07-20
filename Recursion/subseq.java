import java.util.ArrayList;

public class subseq {
    public static void main(String[] args) {
        System.out.println(seq("", "abc"));
    }

    public static ArrayList<String> seq(String p, String up) {
        ArrayList<String> al = new ArrayList<>();
        if (up.isEmpty()) {
            al.add(p);
            return al;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = seq(p + ch, up.substring(1));
        ArrayList<String> right = seq(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
