class Solution {
    public int kthFactor(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                arr.add(i);
            
        }
        }
        for(int i=0;i<arr.size(); i++){
            if(i==k-1){
                return arr.get(i);
            }
        }
    return -1; 
    }
}
