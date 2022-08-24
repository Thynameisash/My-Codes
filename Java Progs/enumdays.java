import java.util.Scanner;

enum Days {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

public class enumdays {
    public static void main(String[] args) {

        System.out.println("Enter the number of day you want");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        System.out.println(fetch(ch));

        sc.close();
    }

    static Days fetch(int ch) {
        switch (ch) {
            case 1:
                return Days.Monday;
            case 2:
                return Days.Tuesday;
            case 3:
                return Days.Wednesday;
            case 4:
                return Days.Thursday;
            case 5:
                return Days.Friday;
            case 6:
                return Days.Saturday;
            case 7:
                return Days.Sunday;

            default:
                System.out.println("Invalid");
                break;
        }
    }
}
