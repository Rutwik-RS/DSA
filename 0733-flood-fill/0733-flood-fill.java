class Pair{
    int row,col;
    Pair(int row,int col){
        this.row=row;
        this.col = col;
    }
}
class Solution {
    public int[][] floodFill(int[][] a, int sr, int sc, int color) {
        int n = a.length;
        int m = a[0].length;
        int[][] vis = new int[n][m];
        BFS(a,sr,sc,n,m,color,vis);
        return a;
    }
    public void BFS(int[][] a, int sr, int sc,int n,int m, int c,int[][] vis)
    {
        boolean tr = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(sr,sc));
        int org = a[sr][sc];
        a[sr][sc] = c;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            Pair p = q.poll();
            for(int[] d:dir){
                int x = p.row + d[0];
                int y = p.col + d[1];
                if(x>=0 && x<n && y>=0 && y<m){
                if(a[x][y] == org && vis[x][y] ==0)
                {
                    tr=false;
                    a[x][y]=c;
                    vis[x][y]=1;
                    q.add(new Pair(x,y));
                }}
            }

        }
        if(tr)
        a[sr][sc]=c;
    }
    
}