import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class readwrite {
    public static void main(String[] args) throws Exception {
        File f1 = new File("X:\\abc.txt");
        File f2 = new File("X:\\xyz.txt");
        FileReader fr = new FileReader(f1);
        FileWriter fw = new FileWriter(f2);
        int i = fr.read();
        while (i > -1) {
            fw.write(i);
            i = fr.read();
        }
        System.out.println("Text written to the second file !");
        fr.close();
        fw.close();
    }
}