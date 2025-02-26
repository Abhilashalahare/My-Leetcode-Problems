class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       int n = grid.length;
       int cnt[] = new int[n*n+1];
       int repeat=-1;
       int miss=-1;

       for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
           cnt[grid[i][j]]++;
        }
       }

       for(int i=1; i<=n*n; i++){
        if(cnt[i]==0){
            miss=i;
        }
          else if(cnt[i]==2){
            repeat=i;
        }
       }
       return new int[]{repeat,miss};
    }
}