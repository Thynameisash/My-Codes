public class preservespace {
    public static void main(String args[]) {
        String str = "This is a java prog";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.insert(i, " ");
            }
        }
        sb.append("");
        System.out.println(sb);
    }
}
