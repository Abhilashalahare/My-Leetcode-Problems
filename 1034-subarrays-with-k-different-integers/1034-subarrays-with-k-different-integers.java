class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
      return calc(nums, k) - calc(nums, k-1);

    }


    private int calc(int nums[], int k){
        int r=0; int l=0; int ans =0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(r=0; r<nums.length; r++){
            map.put(nums[r], map.getOrDefault(nums[r],0)+1);

            while(map.size() > k){
                map.put(nums[l], map.get(nums[l])-1);

                if(map.get(nums[l]) == 0){
                   map.remove(nums[l]);
                }
                l= l+1;
            }

            ans = ans+ (r-l+1);

        }
        return ans;
    }
}