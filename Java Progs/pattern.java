public class pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = i; k <= 5; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
        for (int i = 5; i > 1; i--) {
            for (int k = i - 1; k <= 5; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}