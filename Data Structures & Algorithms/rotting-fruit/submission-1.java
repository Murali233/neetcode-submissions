class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] vist=new boolean[n][m];
        int maxitime=0;
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2&&!vist[i][j]){
                    q.add(new int[]{i,j,0});
                    vist[i][j]=true;
                }
            }
        }
        while(!q.isEmpty()){
            int[] temp=q.poll();
            int row=temp[0];
            int col=temp[1];
            int time=temp[2];
            maxitime=Math.max(maxitime,time);
            int[] delrow={-1,0,+1,0};
            int[] delcol={0,+1,0,-1};
            for(int i=0;i<4;i++){
                int nrow=row+delrow[i];
                int ncol=col+delcol[i];
                if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&grid[nrow][ncol]==1&&vist[nrow][ncol]==false){
                    q.add(new int[]{nrow,ncol,time+1});
                    vist[nrow][ncol]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!vist[i][j]&&grid[i][j]==1) return -1;
            }
        }
        return maxitime;
    }
}
