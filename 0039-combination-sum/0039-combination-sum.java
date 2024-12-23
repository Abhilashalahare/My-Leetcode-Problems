class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        rec(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }

    void rec(int i, int target, int[] arr,  List<List<Integer>> ans ,List<Integer> ds){
        if(i==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
       if(arr[i]<=target){
        ds.add(arr[i]);
        rec(i, target-arr[i],arr,ans,ds);
        ds.remove(ds.size()-1);
       }

        rec(i+1, target,arr,ans,ds);
    }
}