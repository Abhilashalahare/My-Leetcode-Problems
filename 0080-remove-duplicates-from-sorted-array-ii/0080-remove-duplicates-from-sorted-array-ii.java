class Solution {
    public int removeDuplicates(int[] nums) {
 Map<Integer, Integer> freq = new HashMap<>();
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            freq.put(val, freq.getOrDefault(val, 0) + 1);

            if (freq.get(val) <= 2) {
                nums[index] = val;
                index++;
            }
        }

        return index;
    }
}