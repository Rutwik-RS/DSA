class Solution {
    static int[] dp = new int[10000+1] ;
    static boolean check = false;
    public int numSquares(int n) {
        if(!check)
        {
            Arrays.fill(dp,Integer.MAX_VALUE);
            dp[0]=0;
            for(int i=0;i<10000+1;i++)
            {
                for(int j=1;j*j<=i;j++)
                {
                    dp[i] = Math.min(dp[i],dp[i-(j*j)]+1);
                }
            }
            System.out.println(dp[1]);
            check = true;
        }
        return dp[n];
    }
}