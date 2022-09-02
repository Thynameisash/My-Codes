import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexsymbol {
    public static void main(String[] args) {
        String s = "My name -John Smith- and i am good";
        String regex = "[\\W]";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        char c[] = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (m.find()) {
                System.out.println(m.group());
            }
        }
    }
}
