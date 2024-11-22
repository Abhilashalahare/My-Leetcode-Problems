class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int ans =-1;
        int n= nums.length;
            int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
           
            maxi = Math.max(maxi, nums[i]);
        }
        int low=1; int high=maxi;

        while(low<=high){
            int mid = (low+high)/2;

            if(sumOfD(nums, mid) <= threshold){
                ans = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    public int sumOfD(int arr[], int mid){//mid=divisor
        int n= arr.length;
        int sum=0;

        for(int i=0; i<n; i++){
            sum += Math.ceil((double)(arr[i])/ (double)(mid));
        }
        return sum;
    }
}