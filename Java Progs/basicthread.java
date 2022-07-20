class Mythread extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("My thread is running");
        }
    }
}

class Mythread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("My thread2 is running");
        }
    }
}

public class basicthread {
    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();
    }
}
