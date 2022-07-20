import java.io.File;

public class fileinfo {
    public static void main(String[] args) {
        File f = new File("X:\\Java Progs\\fileinfo.java");
        if (f.exists()) {
            System.out.println("Name: " + f.getName());
            System.out.println("Path: " + f.getAbsolutePath());
            System.out.println("Size: " + f.length());
            System.out.println("Writeable: " + f.canWrite());
            System.out.println("Readable: " + f.canRead());
        } else {
            System.out.println("The File does not exist");
        }
    }
}
