class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
          List<List<Integer>> ans = new ArrayList<>();
         int n= nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            //remove duplicates:
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            //moving 2 pointers:
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    // List<Integer> temp =new ArrayList<>();
                    // temp.add(nums[i]);
                    // temp.add(nums[j]);
                    // temp.add(nums[k]); is same as
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    // while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }

        return ans;
    }
}