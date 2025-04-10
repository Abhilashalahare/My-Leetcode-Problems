class Solution {
    public int commonFactors(int a, int b) {
        ArrayList<Integer> ans =  new ArrayList<Integer>();
    	int n =  Math.min(a, b);
    	
    	for (int i = 1; i <= n; i++) {
			 if(a % i == 0 && b % i == 0) {
				 ans.add(i);
			 }
		}    	
    	
    	
    	return ans.size();
    }
}