class Solution {
    public boolean stoneGame(int[] a) {
        int n = a.length;
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++)
        {
            dp[i][i] = a[i];
        }
        for(int len=2;len<=n;len++)
        {
            for(int l=0;l+len-1<n;l++)
            {
                int r = l+len-1;
                int left = a[l] - dp[l+1][r];
                int right = a[r] - dp[l][r-1];
                dp[l][r] = Math.max(left,right);
            }
        }

        if(dp[0][3] >=0) return true;
        else return false;

    }
}