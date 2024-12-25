class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        rec( nums, freq, ans, new ArrayList<>());
        return ans;
    }

     void rec( int[] nums, boolean[] freq,  List<List<Integer>> ans,  List<Integer> ds){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return ;
        }

        for(int i=0; i<nums.length; i++){
            if(!freq[i]){
              freq[i] = true;
              ds.add(nums[i]);
              rec(nums,freq,ans,ds);
              ds.remove(ds.size()-1);
              freq[i] = false;

            }
        }

    }
}