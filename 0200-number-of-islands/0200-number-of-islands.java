class Solution {
    int row[] ={1,-1,0,0};
     int col[] = {0,0,1,-1};
    int n=0; int m=0;
    public  boolean check(int r, int c){
        if(r>=0 && r<n && c>=0 && c<m ) return true;
        return false;
    }

    public void dfs(int r, int c, char grid[][], boolean vis[][]){
        vis[r][c] = true;
       for(int i=0; i<4; i++){
        int newrow = r + row[i];
        int newcol = c + col[i];
        
        if(check(newrow,newcol) && grid[newrow][newcol]=='1' && vis[newrow][newcol]==false){
            dfs(newrow, newcol, grid, vis);
        }
       }
    }
    public int numIslands(char[][] grid) {
         n= grid.length;
         m=grid[0].length;
        boolean vis[][] = new boolean[n][m];

        for(int i=0;i<n; i++){
            for(int j=0; j<m; j++){
                vis[i][j]=false;
            }
        }
        int cnt=0;
         for(int i=0;i<n; i++){
            for(int j=0; j<m; j++){
                if(vis[i][j]==false && grid[i][j]=='1'){
                    dfs(i, j, grid, vis);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}