class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int oddcnt =0;
        int l=0; 
        int res=0;
        int cnt=0;

        for(int r=0; r<nums.length;r++){
            if(nums[r]%2==1){
                oddcnt++;
                cnt =0;
            }
            while(oddcnt ==k){
                if(nums[l]%2 == 1){
                    oddcnt--;
                }
                cnt++;
                l++;
            }
            res += cnt;
        }
        return res;
    }
}