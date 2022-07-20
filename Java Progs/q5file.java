import java.io.File;

public class q5file {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users");
        String f1list[] = f1.list();
        for (String s : f1list) {
            System.out.println(s);
        }
    }
}
