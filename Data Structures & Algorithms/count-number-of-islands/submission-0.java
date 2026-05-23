class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vist=new boolean[n][m];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vist[i][j]&&grid[i][j]=='1'){
                    bfs(i,j,grid,vist);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void bfs(int i, int j,char[][] grid,boolean[][] vist){
        Queue<int[]> q=new LinkedList<>();
        q.add(new int[]{i,j});
        vist[i][j]=true;
        while(!q.isEmpty()){
            int[] temp=q.poll();
            int row=temp[0];
            int col=temp[1];
            int[] delrow={-1,0,1,0};
            int[] delcol={0,+1,0,-1};
            for(int k=0;k<4;k++){
                int nrow=row+delrow[k];
                int ncol=col+delcol[k];
                if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && !vist[nrow][ncol] && grid[nrow][ncol]=='1'){
                    q.add(new int[]{nrow,ncol});
                    vist[nrow][ncol]=true;
                }
            }
        }
    }
}
