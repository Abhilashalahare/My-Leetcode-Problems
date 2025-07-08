class Solution {
    public int subarraySum(int[] nums, int k) {
        // int i=0; 
        int cnt=0;
        int sum=0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int j=0; j<nums.length; j++){
            sum += nums[j];

            if(map.containsKey(sum-k)){
                cnt += map.get(sum-k) ;
            }

            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return cnt;

    }
}