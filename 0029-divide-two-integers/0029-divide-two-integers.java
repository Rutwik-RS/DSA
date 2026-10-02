class Solution {
    public int divide(int div, int dis) {
        if (div == Integer.MIN_VALUE && dis == -1)
            return Integer.MAX_VALUE;

        boolean negative = (div < 0) ^ (dis < 0);

        long dividend = Math.abs((long) div);
        long divisor = Math.abs((long) dis);

        long ans = 0;

        while (dividend >= divisor) {
            long val = divisor;
            long cnt = 1;

            while (val <= dividend - val) {
                val += val;
                cnt += cnt;
            }

            dividend -= val;
            ans += cnt;
        }

        if (negative)
            ans = -ans;

        return (int) ans;
    }
}
