class Pair {
    int row, col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int findPaths(int n, int m, int max, int str, int stc) {
        int mod = 1000000007;
        int ans = 0;

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(str, stc));

        int[][] ways = new int[n][m];
        ways[str][stc] = 1;

        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        for(int step = 0; step < max; step++) {
            int[][] nextWays = new int[n][m];
            int k = q.size();

            while(k-- > 0) {
                Pair p = q.poll();
                int row = p.row;
                int col = p.col;

                for(int[] d : dir) {
                    int nr = row + d[0];
                    int nc = col + d[1];

                    if(nr < 0 || nr >= n || nc < 0 || nc >= m) {
                        ans = (ans + ways[row][col]) % mod;
                    }
                    else {
                        if(nextWays[nr][nc] == 0)
                            q.add(new Pair(nr, nc));

                        nextWays[nr][nc] =
                            (nextWays[nr][nc] + ways[row][col]) % mod;
                    }
                }
            }

            ways = nextWays;
        }

        return ans;
    }
}