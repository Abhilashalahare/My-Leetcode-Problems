class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0, len=0;
        map.put(0,-1); //TO HANDLE THE SUM WITH ZERO, I-(-1) WILL GIVE THE I+1 LENGTH BECAUSE WE HAVE TO INCLUDE FROM THE 0TH INDEX 
        for(int i=0; i<nums.length; i++){
    
            if(nums[i] == 0){
                sum -= 1;  
            }else{
                sum += 1;       
            }

            if(map.containsKey(sum)){
               len = Math.max(len, i-map.get(sum));
            }
            else
            map.put(sum, i);
        }

        return len;
    }
}