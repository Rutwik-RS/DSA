class Pair{
    int row,col;
    public Pair(int row,int col)
    {
        this.row=row;
        this.col=col;
    }
}

class Solution {
    public int[][] highestPeak(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        Queue<Pair> q = new LinkedList<>();  
        int[][] h = new int[n][m];
        boolean[][] vis = new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i][j] == 1){
                    vis[i][j]=true;
                q.add(new Pair(i,j));
                h[i][j] = 0;        }
            }
        }
        int hei = 1;
        while(!q.isEmpty())
        {

            int k = q.size();
            while(k-->0){
                int row = q.peek().row;
                int col = q.peek().col;
                q.poll();
                int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
                for(int[] d:dir)
                {
                    int nr = d[0]+row;
                    int nc = d[1]+col;
                    if(nr>=0&&nr<n&&nc>=0&&nc<m)
                    {
                        if(!vis[nr][nc]){
                            vis[nr][nc]=true;
                        h[nr][nc] = hei;
                        q.add(new Pair(nr,nc));}
                    }
                }
            }
            hei++;
        }
        return h;

    }

}