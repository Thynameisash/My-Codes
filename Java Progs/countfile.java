import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class countfile {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                lineCount++;
                String[] words = currentLine.split(" ");
                wordCount = wordCount + words.length;

                for (String word : words) {
                    charCount = charCount + word.length();
                }
                currentLine = reader.readLine();
            }
            System.out.println("Number of character in file : " + charCount);
            System.out.println("Number of words in a file : " + wordCount);
            System.out.println("Number of lines in file : " + lineCount);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
