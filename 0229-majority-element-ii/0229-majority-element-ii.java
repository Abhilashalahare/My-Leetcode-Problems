class Solution {
    public List<Integer> majorityElement(int[] nums) {
      int cnt1=0, cnt2=0;
      int e1=Integer.MIN_VALUE,e2=Integer.MIN_VALUE;

      for(int i=0; i<nums.length; i++){
        if(cnt1==0 && nums[i]!=e2){
            cnt1 = 1;
            e1 = nums[i];
        }else if(cnt2==0 && nums[i]!=e1){
            cnt2=1;
            e2=nums[i];
        }
        else if(e1==nums[i]) cnt1++;
        else if(e2==nums[i]) cnt2++;

        else{
            cnt1--;
            cnt2--;
        }
      }
          List<Integer> ls = new ArrayList<>(); // list of answers

        // Manually check if the stored elements in
        // el1 and el2 are the majority elements:
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == e1) cnt1++;
            if (nums[i] == e2) cnt2++;
        }

        int mini = (int)(nums.length / 3) + 1;
        if (cnt1 >= mini) ls.add(e1);
        if (cnt2 >= mini) ls.add(e2);

        // Uncomment the following line
        // if it is told to sort the answer array:
        //Collections.sort(ls); //TC --> O(2*log2) ~ O(1);

        return ls;
    }
}