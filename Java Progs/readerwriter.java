import java.io.*;

public class readerwriter {
    public static void main(String[] args) throws Exception {
        File f = new File("X:\\abc.txt");
        FileWriter fw = new FileWriter(f, true);
        fw.write("MAYBE I AM CHEEMS");
        fw.close();

        FileReader fr = new FileReader(f);
        int i = fr.read();
        while (i != -1) {
            System.out.println((char) i);
            i = fr.read();
        }

    }

}
