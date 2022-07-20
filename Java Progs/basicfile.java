import java.io.*;

public class basicfile {
    public static void main(String[] args) throws Exception {
        FileReader f1 = new FileReader("demo1.txt");
        // FileReader f2 = new FileReader("demo2.txt");
        FileWriter f3 = new FileWriter("demo2.txt", true);

        int i = f1.read();
        while (i > -1) {
            System.out.println(i);
            i = f1.read();
            f3.write(i);
        }
        f1.close();
        f3.close();
    }

}
