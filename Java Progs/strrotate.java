public class strrotate {
    public static void main(String[] args) {
        String s = "house";
        String s2 = "esuoh";
        int c = 0;
        char arr[] = new char[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[c] = s.charAt(i);
            c++;
        }
        String rs = new String(arr);
        if (rs.equals(s2)) {
            System.out.println("S2 is rotated version of S1");
        } else
            System.out.println("S2 is not rotated version of S1");
    }
}
