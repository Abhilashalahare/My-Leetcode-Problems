class Solution {
      
 
    public int findCircleNum(int[][] isConnected) {
        int n= isConnected.length;

        ArrayList<Integer> adj[] = new ArrayList[n+1];
        for(int i=0;i<=n; i++){
        adj[i] = new ArrayList<Integer>();

        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n ;j++){
                if(i==j) continue; //self loop
                if(isConnected[i][j] == 1){
                    adj[i+1].add(j+1);
                }
            }
        }

        boolean vis[] = new boolean[n+1];
        for(int i=0; i<n; i++){
            vis[i]=false;
        }
        int count =0;
        for(int i=1; i<=n; i++){
            if(vis[i]==false){
                dfs(adj, i, vis);
                count++;
            }
        }
        return count;

       
       
    }

    public static void dfs( ArrayList<Integer> adj[], int n, boolean vis[]){
        vis[n] = true;

      for(int x : adj[n]){
        if(!vis[x]){
            dfs(adj, x,vis);
        }
      }

    }
}