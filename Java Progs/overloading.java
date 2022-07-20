public class overloading {
    void func() {
        System.out.println("Rose is a beautiful flower");
        System.out.println("Rose is a beautiful flower");
    }

    void func(String ss) {
        System.out.println(ss);
        System.out.println(ss);
    }

    void func(String s, int a) {
        while (a >= 1) {
            System.out.println(s);
            a--;
        }
    }

    public static void main(String[] args) {
        overloading o = new overloading();
        o.func();
        o.func("Sunflower is a beautiful flower");
        o.func("Marigold is a beautiful flower", 4);
    }
}
