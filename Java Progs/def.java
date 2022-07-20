import java.util.ArrayList;

interface defi {
    void hello();

    void bye();

    default void greet() {
        System.out.println("gm");
    }
}

public class def implements defi {
    @override
    public void hello() {
        System.out.println(("Hello"));
    }

    @override
    public void bye() {
        System.out.println(("byebye"));
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.forEach((x) -> {
            System.out.println(x);
        });
        def d = new def();
        d.hello();
        d.bye();
        d.greet();
    }
}
