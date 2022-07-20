import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int sum = 0;
            int n = num;
            int f = num;
            while (n != 0) {
                num = n % 10;
                sum = (sum * 10) + num;
                n = n / 10;
            }
            System.out.println("Original : " + f + "\tReverse: " + sum);
        }
    }
}
