import java.util.Scanner;

public class charoccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        System.out.println("Enter character to search : ");
        char c = sc.next().charAt(0);
        char arr[] = new char[s.length()];
        int count = 0;
        for (int i = 0; i <= s.length() - 1; i++) {
            arr[i] = s.charAt(i);
            if (arr[i] == c) {
                count++;
            }
        }
        System.out.println("Char appeared " + count + " times");
        sc.close();
    }
}
