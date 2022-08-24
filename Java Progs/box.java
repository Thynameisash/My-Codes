class boxweight {
    boxweight(int l, int b, int h) {
        System.out.println("Volume is " + l * b * h);
    }
}

public class box extends boxweight {
    box(int l, int b, int h) {
        super(l, b, h);
    }

    public static void main(String[] args) {
        new box(10, 20, 30);
    }
}
