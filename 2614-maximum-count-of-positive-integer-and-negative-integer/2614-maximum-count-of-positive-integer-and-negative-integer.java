class Solution {
    public int maximumCount(int[] nums) {
        int Maxcnt=0;
        int Mincnt=0;
        for(int i=0; i<nums.length; i++){
             if(nums[i]>0){
                Maxcnt++;
             }else if(nums[i]<0){
                Mincnt++;
             }
        }
        return Math.max(Maxcnt, Mincnt);
    }
}