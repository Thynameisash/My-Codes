import java.util.Scanner;

public class eachchar {
    public static void main(String[] args) {
        System.out.println("Enter String");
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            int count[] = new int[s.length()];
            for (int i = 0; i < count.length; i++) {
                count[i] = 1;
            }

            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        count[i]++;
                    }
                }
            }

            for (int i = 0; i < s.length(); i++) {
                System.out.println(s.charAt(i) + " -> " + count[i]);
            }
        }
    }
}

// import java.util.Scanner;
// public class Main {
// public static void main(String args[]) {
// String str;
// int i, length, counter[] = new int[256];
// Scanner scanner = new Scanner(System.in);
// System.out.println("Enter a String");
// str = scanner.nextLine();
// length = str.length();
// for (i = 0; i < length; i++) {
// counter[(int) str.charAt(i)]++;
// }
// for (i = 0; i < 256; i++) {
// if (counter[i] != 0) {
// System.out.println((char) i + " -> " + counter[i]);
// }
// }
// }
// }
