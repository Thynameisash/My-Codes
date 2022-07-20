import java.util.Scanner;
public class primerange {
    public static void main(String[] args) {
        System.out.println("Enter the lower and upper bound of range : ");
        Scanner sc = new Scanner(System.in);
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        int flag;
        System.out.printf("\nPrime numbers between " + lower + " and " + upper + " are : ");
        while (lower <= upper) {
            flag = 0;
            for (int i = 2; i <= lower / 2; ++i) {
                if (lower % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0 && lower != 0 && lower != 1)
                System.out.print(lower + " ");
            lower++;
        }
        sc.close();
    }
}
