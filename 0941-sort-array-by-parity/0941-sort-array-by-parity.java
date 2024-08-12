class Solution {
    public int[] sortArrayByParity(int[] nums) {
       ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }        
        }

       int i=0;
        for(; i<even.size(); i++){
            nums[i] =  even.get(i);
        }

        for(int j=0; j<odd.size(); j++){
            nums[i] = odd.get(j);
            i++;
        }

        return nums;

        }  
          
       
}