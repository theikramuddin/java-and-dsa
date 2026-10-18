import java.util.*;
public class ClimbingStair {
    public static int climbStairs(int n) { // O(2^n) using recursion
        if(n==0) return 1;
        if(n<0) return 0;
        return climbStairs(n-1) + climbStairs(n-2);
    }

    public static int climbStairsTabulation(int n) { // O(n) using tabulation
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    public static int climbStairsMemo(int n, int dp[]) { // O(n) using memoization
        if(n==0) return 1;
        if(n<0) return 0;
        if(dp[n] != -1) return dp[n];
        return dp[n] = climbStairsMemo(n-1, dp) + climbStairsMemo(n-2, dp);
    }

    public static void main(String args[]) {
        int n = 5;
        // System.out.println(climbStairs(n));
        // System.out.println(climbStairsTabulation(n));
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(climbStairsMemo(n, dp));
    }
}