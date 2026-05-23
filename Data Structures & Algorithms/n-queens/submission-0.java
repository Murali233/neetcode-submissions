class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list=new ArrayList<>();
        char[][] board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        dfs(0,board,list);
        return list;
    }
    public static void dfs(int col,char[][] board,List<List<String>> list){
        if(col==board.length){
            list.add(compute(board));
            return;
        }
        for(int row=0;row<board.length;row++){
            if(validate(row,col,board)){
                board[row][col]='Q';
                dfs(col+1,board,list);
                board[row][col]='.';
            }
        }
    }
    public static boolean validate(int row,int col,char[][] board){
        int duprow=row;
        int dupcol=col;
        while(row>=0&&col>=0){                     //  ^
            if(board[row][col]=='Q') return false; //   \
            col--;
            row--;
        }
        row=duprow;
        col=dupcol;
        while(col>=0){
            if(board[row][col]=='Q') return false;  //  <-
            col--;
        }
        row=duprow;
        col=dupcol;
        while(row<board.length&&col>=0){           //  /
            if(board[row][col]=='Q') return false; // v
            row++;
            col--;
        }
        return true;
    }
    static List<String> compute(char[][] board){
        List<String> temp=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String str=new String(board[i]);
            temp.add(str);
        }
        return temp;
    } 
}
