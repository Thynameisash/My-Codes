public class lc {
    public static void main(String[] args) {
        m1();
    }

    static void m1() {
        int[] cardPoints = { 1, 2, 3, 4, 5, 6, 1 };
        int k = 3;
        int sumr = 0;
        // int suml = 0;
        int n = cardPoints.length;
        // for (int i = 0; i <= k - 1; i++) {
        //     sumr += cardPoints[i];
        //     System.out.println(i + " " + sumr);
        // }
        for (int j = n - 1; j >= k + 1; j--) {
            sumr += cardPoints[j];
            System.out.println(j);
        }
        System.out.print(sumr);
        // System.out.print(suml);
        
    }
}
