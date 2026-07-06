class Solution {
    public int removeCoveredIntervals(int[][] a) {
        int maxEnd=0;
        Arrays.sort(a, (x, y) -> x[0] == y[0] ? y[1] - x[1] : x[0] - y[0]);
        int cnt=0;
        for (int i = 0; i < a.length; i++) {
        if (a[i][1] > maxEnd) {
            cnt++;
            maxEnd = a[i][1]; 
        }
    }
    return cnt;
    }
}