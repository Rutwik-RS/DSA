class Solution {
    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

    public int regionsBySlashes(String[] a) {
        int n = a.length;
        int[][] mat = new int[n * 3][n * 3];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int row = i * 3;
                int col = j * 3;

                if(a[i].charAt(j) == '/') {
                    mat[row][col + 2] = 1;
                    mat[row + 1][col + 1] = 1;
                    mat[row + 2][col] = 1;
                }
                else if(a[i].charAt(j) == '\\') {
                    mat[row][col] = 1;
                    mat[row + 1][col + 1] = 1;
                    mat[row + 2][col + 2] = 1;
                }
            }
        }

        int cnt = 0;

        for(int i = 0; i < n * 3; i++) {
            for(int j = 0; j < n * 3; j++) {
                if(mat[i][j] == 0) {
                    dfs(i, j, mat);
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public void dfs(int row, int col, int[][] mat) {
        int n = mat.length;

        if(row < 0 || row >= n || col < 0 || col >= n || mat[row][col] == 1)
            return;

        mat[row][col] = 1;

        for(int[] d : dir) {
            dfs(row + d[0], col + d[1], mat);
        }
    }
}