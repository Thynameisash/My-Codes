public class immut {
    public static void main(String[] args) {
        String a = "abc";
        String b = a;
        a = a.concat("d");
        System.out.println(a);
        System.out.println(b);
        StringBuffer c = new StringBuffer("abc");
        StringBuffer d = c;
        c.append("d");
        System.out.println(c);
        System.out.println(d);
    }
}
