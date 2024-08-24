class Solution {
    public double minimumAverage(int[] nums) {
    double[] avg = new double[nums.length];
    double ans= Integer.MAX_VALUE;
        Arrays.sort(nums);
        int j=nums.length-1;
        int i=0;
     while( i<j){
            ans = Math.min(ans, (nums[i] + nums[j])/2.0);
            i++;
            j--;
            
        }
    

      return ans;
    }
}