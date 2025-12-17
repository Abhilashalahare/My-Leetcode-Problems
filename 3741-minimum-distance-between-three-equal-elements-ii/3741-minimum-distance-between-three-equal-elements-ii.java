class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        int minDis = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
        
        for(int key: map.keySet()){
            ArrayList<Integer> temp = map.get(key);
            if(temp.size() >= 3){
           for(int j=0; j<=temp.size()-3; j++) {
                int sum = 2*(temp.get(j+2) - temp.get(j)); //2(k-i)
                minDis = Math.min(minDis, sum);
                }
            }
                 
            }
        
        return minDis == Integer.MAX_VALUE? -1: minDis;
    }
}