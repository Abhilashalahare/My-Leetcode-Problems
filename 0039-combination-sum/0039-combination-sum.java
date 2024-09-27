class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> temp =new ArrayList<>();
     void rec(int arr[], int sum, int i, int target){
         //base case

         if(sum>target) return;

         if(i==arr.length) {
            if(sum == target){
             ans.add(new ArrayList(temp));
         }
         return;
         }
         
         //take
         
         temp.add(arr[i]);
         rec(arr,sum+arr[i], i, target);
         temp.remove(temp.size()-1);
         
         //dont take
         rec(arr, sum, i+1,target);
         
     }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        rec(candidates,0,0,target );
        return ans; 
    }
}