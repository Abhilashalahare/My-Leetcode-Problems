class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum =0, rsum=0, maxSum=0;
        int n= cardPoints.length;


        for(int i=0; i<k; i++){
          lsum += cardPoints[i];
          maxSum = lsum;

        }
       

         int r= n-1;
         for(int i=k-1; i>=0; i--){
            lsum -= cardPoints[i];
            rsum += cardPoints[r];
            r--;

            maxSum = Math.max(maxSum, lsum + rsum);
         }

         return maxSum;
    }
}