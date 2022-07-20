class mt1 extends Thread {
    public void run() {
        // System.out.println("Table of 2:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
    }
}

class mt2 extends Thread {
    public void run() {
        // System.out.println("Table of 3:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("3 * " + i + " = " + 3 * i);
        }
    }
}

class mt3 extends Thread {
    public void run() {
        // System.out.println("Table of 4:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("4 * " + i + " = " + 4 * i);
        }
    }
}

public class tablethread {
    public static void main(String[] args) {
        mt1 t1 = new mt1();
        t1.start();
        mt2 t2 = new mt2();
        t2.start();
        mt3 t3 = new mt3();
        t3.start();

    }
}
