class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      List<List<Integer>> ans = new ArrayList<>();
      Arrays.sort(candidates);
        rec(candidates, 0, target,ans, new ArrayList<>());
        return ans;
    }


    void rec(int[] arr, int idx,int target, List<List<Integer>> ans, List<Integer> ds){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
     for(int i=idx; i<arr.length; i++){
        if(i>idx && arr[i]==arr[i-1]) continue;//duplicate elet
        if(arr[i]>target) break;

        ds.add(arr[i]);
        rec(arr,i+1,target-arr[i],ans,ds);
        ds.remove(ds.size()-1);
     }
   
    }
}