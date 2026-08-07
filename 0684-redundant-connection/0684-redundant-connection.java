class Solution {
    public int[] findRedundantConnection(int[][] a) {
        int n = a.length;
        Map<Integer, List<Integer>> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            mp.putIfAbsent(a[i][0], new ArrayList<>());
            mp.putIfAbsent(a[i][1], new ArrayList<>());
            mp.get(a[i][0]).add(a[i][1]);
            mp.get(a[i][1]).add(a[i][0]);
            if (bfs(mp, n)) {
                return a[i];
            }
        }
        return new int[0];
    }
    public boolean bfs(Map<Integer, List<Integer>> mp,int n)
    {
         Queue<int[]> q = new LinkedList<>();
        boolean[] vis = new boolean[n+1];
        List<Integer> ls = new ArrayList<>();
        for (int i : mp.keySet()) {
            if (!vis[i]) {

                q.add(new int[]{i,-1});
                vis[i] = true;
                while (!q.isEmpty()) {
                    int[] cur = q.poll();
                    int node = cur[0];
                    int par = cur[1];
                    for (int j : mp.get(node)) {
                        if (!vis[j]) {
                            vis[j] = true;
                            q.add(new int[]{j,node});
                        } 
                        else if(j!=par)
                        {
                            return true;
                        }  
                            
                    }
                }
            }
        }
        return false;
    }
    }