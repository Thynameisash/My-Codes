public class lambda {
    public static void main(String[] args) {
        Runnable t1 = () -> {
            {
                System.out.println("Hi");
            }
        };
        Thread myt = new Thread(t1);
        myt.start();
    }
}
