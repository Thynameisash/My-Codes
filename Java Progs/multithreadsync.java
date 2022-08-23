
public class multithreadsync {

    class Mythread1 extends Thread {
        @Override
        public void run() {
            synchronized (this) {
                for (int i = 1; i <= 10; i++) {
                    try {
                        if (i % 2 != 0) {
                            System.out.println(i);
                            wait();
                            notify();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }

    class Mythread2 extends Thread {
        @Override
        public void run() {
            synchronized (this) {
                for (int i = 1; i <= 10; i++) {
                    try {
                        if (i % 2 == 0) {
                            System.out.println(i);
                            wait();
                            notify();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        multithreadsync obj1 = new multithreadsync();
        multithreadsync.Mythread1 t1 = obj1.new Mythread1();
        multithreadsync.Mythread1 t2 = obj1.new Mythread1();
        t1.start();
        t2.start();
    }
}

// // Java program for the above approach

// public class multithreadsync {
// int counter = 1;
// static int N;

// public void printOddNumber() {
// synchronized (this) {
// while (counter < N) {
// while (counter % 2 == 0) {
// try {
// wait();
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// System.out.print(counter + " ");
// counter++;
// notify();
// }
// }
// }

// public void printEvenNumber() {
// synchronized (this) {
// while (counter < N) {
// while (counter % 2 == 1) {
// try {
// wait();
// } catch (InterruptedException e) {
// e.printStackTrace();
// }
// }
// System.out.print(counter + " ");
// counter++;
// notify();
// }
// }
// }

// public static void main(String[] args) {
// N = 10;
// multithreadsync mt = new multithreadsync();
// Thread t1 = new Thread(new Runnable() {
// public void run() {
// mt.printEvenNumber();
// }
// });

// Thread t2 = new Thread(new Runnable() {
// public void run() {
// mt.printOddNumber();
// }
// });

// t1.start();
// t2.start();
// }
// }
