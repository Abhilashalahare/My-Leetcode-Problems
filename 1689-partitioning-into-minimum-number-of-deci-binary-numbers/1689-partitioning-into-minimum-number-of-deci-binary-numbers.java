class Solution {
    public int minPartitions(String n) {
          int l = Integer.MIN_VALUE;
        for(int i=0; i<n.length(); i++){
          
            if(n.charAt(i) - '0' > l){
                 l = n.charAt(i) - '0';
            }
        }
        return l;
    }
}