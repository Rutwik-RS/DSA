class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int i = 0, j = 0;

        while (true) {
            if (i - 1 >= 0 && mat[i - 1][j] > mat[i][j]) {
                i--;
            } 
            else if (i + 1 < m && mat[i + 1][j] > mat[i][j]) {
                i++;
            } 
            else if (j - 1 >= 0 && mat[i][j - 1] > mat[i][j]) {
                j--;
            } 
            else if (j + 1 < n && mat[i][j + 1] > mat[i][j]) {
                j++;
            } 
            else {
                return new int[]{i, j};
            }
        }
    }
}