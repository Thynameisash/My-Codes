import java.util.Scanner;

public class strrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String s = sc.nextLine();
        int c = 0;
        char arr[] = new char[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[c] = s.charAt(i);
            c++;
        }
        String rs = new String(arr);
        System.out.println("Reversed str is " + rs);
    }
}
