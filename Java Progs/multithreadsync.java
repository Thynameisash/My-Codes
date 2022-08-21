class Mythread1 extends Thread {
    @Override
    // Odd Thread
    public void run() {
        try {
            printodd();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void printodd() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            } else {
                wait();
            }
            notify();
        }

    }
}

class Mythread2 extends Thread {
    @Override
    // Even Thread
    public void run() {
        try {
            printeven();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void printeven() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                wait();
            }
            notify();
        }

    }
}

public class multithreadsync {
    public static void main(String[] args) {

        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start();
        t2.start();

    }
}