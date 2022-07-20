import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        System.out.println("Enter num");
        int flag = 0;
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    flag = 1;
                } else {
                    flag = 0;
                }
            }
            if (flag == 0)
                System.out.println("Prime");
            else
                System.out.println("Not Prime");

        }
    }
}
