import java.io.File;

public class listfiles {
    public static void main(String[] args) {
        String dirName = "C:\\Users\\Ash\\Documents";
        File dir = new File(dirName);
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file.getName());
            } else {
                System.out.println(file.getName());
                File[] subFiles = file.listFiles();
                for (File subFile : subFiles) {
                    System.out.println(subFile.getName());
                }
            }
        }
    }
}
