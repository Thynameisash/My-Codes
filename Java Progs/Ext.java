public class Ext {
    int x = 5;
    int y = 10;
    public class Inter {
        public void display(String[] args) {
            int z = 20;
            System.out.println("Value of Z: " + z);
            System.out.println("Value of X: " + Ext.this.x);
            System.out.println("Value of Y: " + Ext.this.y);
        }
    }

    public static void main(String[] args) {
        Ext e1 = new Ext();
        Ext.Inter i1 = e1.new Inter();
        i1.display(args);
    }
}
