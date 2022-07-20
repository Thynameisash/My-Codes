import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "lleHo";
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (String.valueOf(c1).equals(String.valueOf(c2))) {
            System.out.println("They are anagram");
        } else
            System.out.println("Not Anagrams");
    }
}
