class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1; i<=numRows; i++){
            ans.add(pascal(i));
        }
        return ans;
    }

    public List<Integer> pascal(int n){
         List<Integer> temp = new ArrayList<>();
          temp.add(1);
        long res = 1;
    

        for(int i=1; i<n; i++){
            res = res*(n-i);
            res = res/i;
             temp.add((int)res);
        }
       
      return temp;
    }
}