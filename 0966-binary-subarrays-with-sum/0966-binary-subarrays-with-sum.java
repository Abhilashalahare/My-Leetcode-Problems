class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
         int n = nums.length, res = 0, preSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            preSum += nums[i];
            if (map.containsKey(preSum - goal)) {
                res += map.get(preSum - goal);
            }
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return res;
    }
}