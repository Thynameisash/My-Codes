import java.util.Scanner;

public class Fibb {
    public static void main(String[] args) {
        int i, a = 0, b = 1, c;
        System.out.print("Enter the number of terms : ");
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (i = 0; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.print(c + " ");
            }
        }
    }
}
