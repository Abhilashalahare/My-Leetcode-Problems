class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
           
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }

            if(map.get(nums[i])==(int)(nums.length/3)+1){
                arr.add(nums[i]);
            }
            
        }
        

        return arr;
    }
}