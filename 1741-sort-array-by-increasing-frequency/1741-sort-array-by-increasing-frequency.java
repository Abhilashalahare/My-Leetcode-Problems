class Solution {
    public int[] frequencySort(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int i=0; i<nums.length; i++){
          map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
       }

       Integer[] temp = new Integer[nums.length];
       for(int i=0; i<nums.length; i++){
        temp[i] = nums[i];
       }

       Arrays.sort(temp, new Comparator<Integer>(){
         public int compare(Integer a, Integer b){
             if(map.get(a) == map.get(b)){
                return b - a;//dec order of value
             }else{
                return map.get(a) - map.get(b); // inc order of freq
             }
         }
       } );
        for(int i=0; i<nums.length; i++){
         nums[i] = temp[i];
       }

       return nums;
    }
}