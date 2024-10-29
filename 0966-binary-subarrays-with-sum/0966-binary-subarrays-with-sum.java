class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
        int n = A.length, res = 0, preSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            preSum += A[i];
            if (map.containsKey(preSum - S)) {
                res += map.get(preSum - S);
            }
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return res;
    }
}