public class f2_shape {
    public static class Rectangle {
        int length;
        int width;

        public Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        public void display() {
            System.out.println("Area of Rectangle is : " + (length * width));
        }
    }

    public static class Triangle {
        int base;
        int height;

        public Triangle(int base, int height) {
            this.base = base;
            this.height = height;
        }

        public void display() {
            System.out.println("Area of Triangle is : " + (0.5 * base * height));
        }
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        Triangle t = new Triangle(10, 20);
        r.display();
        t.display();
    }

}
