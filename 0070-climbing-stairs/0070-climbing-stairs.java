class Solution {
    public int climbStairs(int n) {

          int ar[] = new int[n+1];
      Arrays.fill(ar, -1);

return news(n, ar);

      

    }

    public int news(int n, int ar[]){
       if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
    

      if(ar[n] != -1){
        return ar[n];
      }

      ar[n] = news(n-1, ar) + news(n-2, ar);
      return ar[n];
    }
}