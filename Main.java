import java.util.*;

public class Main {
    public static int minGroups(int[] movies, int diff) {

        Arrays.sort(movies);
        // dp[i] -> min groups when we have i .. movies.length-1 movies available
        int[] dp = new int[movies.length + 1];
        dp[movies.length] = 0;

        for (int idx = movies.length - 1; idx >= 0; idx--) {

            // taking only 1 in current group
            dp[idx] = 1 + dp[idx + 1];

            // trying to take more movies in group
            for (int nextIdx = idx + 1; nextIdx < movies.length - 1; nextIdx++) {

                if (movies[nextIdx] > movies[idx] + diff) {
                    break;
                } else {
                    dp[idx] = Math.min(dp[idx], 1 + dp[nextIdx + 1]);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return dp[0];
    }

    public static void main(String[] args) {

        System.out.println(minGroups(new int[] { 3, 1, 4, 3, 9 }, 10));

    }
}