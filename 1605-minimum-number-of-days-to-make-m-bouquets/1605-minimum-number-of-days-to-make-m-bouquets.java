class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val =(long)m*k;
        int n= bloomDay.length;
        if(n<val) return -1; //impossible case

          int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }

       int low=mini; int high=maxi;
       while(low<=high){
        int mid = (low+high)/2;
        if(possible(bloomDay, mid,m, k)){
            high = mid-1;
        }else{
            low = mid+1;
        }
        
       }
       return low;

    }
     
     public boolean possible(int arr[], int day, int m, int k){
        int cnt=0;
        int noOfB = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] <= day){
                cnt++;
            }else{
                noOfB += (cnt/k);
                cnt=0;
            }

        }
         noOfB += (cnt/k);
        

         return noOfB >= m;
     }
}