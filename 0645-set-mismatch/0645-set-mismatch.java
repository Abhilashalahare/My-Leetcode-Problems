class Solution {
    public int[] findErrorNums(int[] nums) {
        int repeatNum = repeat(nums);
        int naturalSum= naturalSum(nums);
        int actualSum =0;

        for(int i=0; i<nums.length; i++){
          actualSum += nums[i];
        } 

        int missingNum = naturalSum - (actualSum - repeatNum);

      
        return new int[]{repeatNum, missingNum};
    }

    public int repeat(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        for(int i : nums){
            if(map.get(i) > 1){
                return i;
            }
        }
        return 0;
    }

    public int naturalSum(int[] nums){
        int sum =0;
        int n = nums.length;

        int naturalSum = (n*(n+1))/2;

        return naturalSum;
    }
}