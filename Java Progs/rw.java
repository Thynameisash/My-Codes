import java.io.*;

public class rw {
    public static void main(String[] args) throws Exception {
        File f = new File("X:\\abc.txt");
        FileInputStream fis = new FileInputStream(f);
        int i = fis.read();
        while (i != -1) {
            fis.read();
            System.out.println(i);
            i = fis.read();
        }
        
        fis.close();
        FileOutputStream fos = new FileOutputStream(f);
        String s = "HEMLO";
        byte[] b = s.getBytes();
        fos.write(b);
        fos.close();
    }
}
