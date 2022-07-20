import java.util.Scanner;

public class f1_control {
    public static void main(String[] args) {
        System.out.println(
                "Enter the number from the below menu :\nEnter 1 to try If Statement\nEnter 2 to try For Statement\nEnter 3 to try While Statement\nEnter 4 to try Do Statement");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Enter a number to check odd/ even :");
                int c1 = sc.nextInt();
                if (c1 % 2 == 0) {
                    System.out.println("Even\n");
                } else
                    System.out.println("Odd\n");
                break;

            case 2:
                for (int i = 1; i <= 5; i++) {
                    for (int k = i; k <= 5; k++) {
                        System.out.print(k + " ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                int x = 1;
                while (x < 5) {
                    System.out.print(x + " ");
                    x++;
                }
                break;

            case 4:
                int y = 0;
                do {
                    System.out.print(y + " ");
                    y++;
                } while (y < 5);
                break;

            default:
                break;
        }
    }
}
