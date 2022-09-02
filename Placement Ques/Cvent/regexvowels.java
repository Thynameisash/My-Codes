import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexvowels {
    public static void main(String[] args) {
        String vowels = "[aeiouAEIOU]";
        String s = "Hello Tuesday";
        Pattern p = Pattern.compile(vowels);
        Matcher m = p.matcher(s);
        if (m.find()) {
            System.out.print("Contains Vowels");
        } else {
            System.out.print("Does not contain Vowels");
        }
    }
}