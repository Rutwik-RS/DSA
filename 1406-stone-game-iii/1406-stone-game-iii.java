class Solution {
    public String stoneGameIII(int[] a) {
        int n = a.length;
        int[] dp = new int[n + 1];
        int ans = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            int ans1 = a[i] - dp[i + 1];
            int ans2 = (i + 1 < n) ? (a[i] + a[i + 1] - dp[i + 2]) : Integer.MIN_VALUE;
            int ans3 = (i + 2 < n) ? (a[i] + a[i + 1] + a[i + 2] - dp[i + 3]) : Integer.MIN_VALUE;
            dp[i]=Math.max(ans1,Math.max(ans2,ans3));
        }
        if (dp[0] > 0)
            return "Alice";
        else if (dp[0] < 0)
            return "Bob";
        else
            return "Tie";
    }
}