class Pair{
    int row,col;
    Pair(int row,int col){
        this.row = row;
        this.col =col;
    }
}

class Solution {
    public int numEnclaves(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++)
        {for(int j=0;j<m;j++)
        {
            if(i==0||j==0||i==n-1||j==m-1)
            {
                if(a[i][j] ==1)
                bfs(i,j,a,n,m,vis);
            }
        }}
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j] ==1 &&!vis[i][j])
                cnt++;
            }
        }
        return cnt;

    }
    public static void bfs(int i,int j,int[][] a,int n,int m,boolean[][] vis)
    {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        vis[i][j]=true;
        int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        while(!q.isEmpty()){
            Pair p =q.poll();
            int x = p.row;
            int y = p.col;
            for(int[] d:dir){
                int nx = x+d[0];
                int ny = y+d[1];
                if(nx>=0&&nx<n&&ny>=0&&ny<m){
                    if(a[nx][ny] == 1 && !vis[nx][ny]){
                        vis[nx][ny]=true;
                        q.add(new Pair(nx,ny));
                    }
                }
            }
        }
    }
}