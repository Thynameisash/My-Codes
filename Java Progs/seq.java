import java.io.*;

public class seq {
    public static void main(String[] args) throws Exception {
        FileInputStream f1 = new FileInputStream("demo1.txt");
        FileInputStream f2 = new FileInputStream("demo2.txt");
        FileOutputStream f3 = new FileOutputStream("demo5.txt");
        SequenceInputStream s = new SequenceInputStream(f1, f2);
        int i = s.read();
        while (i != -1) {
            System.out.println(i);
            f3.write(i);
            i = s.read();
        }
    }
}
