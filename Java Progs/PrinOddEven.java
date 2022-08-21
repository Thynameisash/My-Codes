public class PrinOddEven {

    boolean isEven = true;
    int value = 0;

    synchronized void printEven() {
        if (!isEven) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value++;
        isEven = false;
        notify();
    }

    synchronized void printOdd() {
        if (isEven) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value++;
        isEven = true;
        notify();
    }

    public static void main(String[] args) {
        final PrinOddEven printOddEven = new PrinOddEven();
        Thread t1 = new Thread("Even") {
            public void run() {
                while (true) {
                    printOddEven.printEven();
                }
            }
        };
        Thread t2 = new Thread("Odd") {
            public void run() {
                while (true)
                    printOddEven.printOdd();
            }
        };
        t1.start();
        t2.start();

    }
}