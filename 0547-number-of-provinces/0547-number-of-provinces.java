class Solution {
    public int findCircleNum(int[][] a) {
        int n = a[0].length;
        boolean[] vis = new boolean[n];
        int cnt = 0;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                cnt++;
                q.add(i);
                vis[i] = true;
                while (!q.isEmpty()) {
                    int row = q.poll();
                    for (int j = 0; j < n; j++) {
                        if (a[row][j] == 1 && vis[j] == false) {
                            vis[j] = true;
                            q.add(j);
                        }
                    }
                }
            }
        }
        return cnt;
    }
}