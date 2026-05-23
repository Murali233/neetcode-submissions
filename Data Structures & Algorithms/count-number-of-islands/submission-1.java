class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vist=new boolean[n][m];
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vist[i][j]&&grid[i][j]=='1'){
                    dfs(i,j,grid,vist);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public void dfs(int row, int col,char[][] grid,boolean[][] vist){
        vist[row][col]=true;
        int[] delrow={-1,0,1,0};
        int[] delcol={0,+1,0,-1};
        for(int k=0;k<4;k++){
            int nrow=row+delrow[k];
            int ncol=col+delcol[k];
            if(nrow>=0 && nrow<grid.length && ncol>=0 && ncol<grid[0].length && !vist[nrow][ncol] && grid[nrow][ncol]=='1'){
                dfs(nrow,ncol,grid,vist);
            }
        }
    }
}
