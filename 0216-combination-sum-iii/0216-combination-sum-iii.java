class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
       List<List<Integer>> ans = new ArrayList<>();
       func(1,k,n,ans,new ArrayList<>());
       return ans; 
    }

    void func(int idx, int k, int n,   List<List<Integer>> ans, List<Integer> ds){
        if(k==0 && n==0 ){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=idx; i<=9; i++){

            if(i>9) break;


            ds.add(i);
            func(i+1, k-1, n-i, ans, ds);
            ds.remove(ds.size()-1);

            



        }

       
    }


}