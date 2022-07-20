class Mythreadrunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("I'm a thread");
    }

    public void start() {
    }

    public void Test() throws InterruptedException
    {

        Thread.sleep(5000);

    }

}

class Mythreadrunnable2 implements Runnable {

    @Override
    public void run() {
        System.out.println("I'm a thread2");
    }

    public void start() {
    }

}

public class threadinter {
    public static void main(String[] args) {
        Mythreadrunnable m1 = new Mythreadrunnable();
        Thread t1 = new Thread(m1);
        Mythreadrunnable2 m2 = new Mythreadrunnable2();
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();

    }
}
