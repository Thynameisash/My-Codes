import java.util.Arrays;
public class jagged {
    public static void main(String[] args) {
        int j[][] = new int[][] {
                new int[] { 1 },
                new int[] { 1, 2 },
                new int[] { 1, 2, 3 },
                new int[] { 1, 2, 3, 4 },
                new int[] { 1, 2, 3, 4, 5 }
        };
        for (int i = 0; i <= j.length; i++) {
            System.out.println(Arrays.toString(j[i]));
        }
    }
}


