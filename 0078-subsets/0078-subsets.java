class Solution {
   
     List<List<Integer>> result = new ArrayList<>();

     
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> currentSubset = new ArrayList<>();
        generateSubsets(nums, 0, currentSubset);
        return result;
    }
    
       private void generateSubsets(int[] nums, int index, List<Integer> currentSubset) {
        if (index == nums.length) {
            result.add(new ArrayList<>(currentSubset));
            return;
        }

        // Include the current element
        currentSubset.add(nums[index]);
        generateSubsets(nums, index + 1, currentSubset);

        // Exclude the current element
        currentSubset.remove(currentSubset.size() - 1);
        generateSubsets(nums, index + 1, currentSubset);
    
    }
}