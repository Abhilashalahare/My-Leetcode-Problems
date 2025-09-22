class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[1000];
        int max =0, cnt=0;
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i] >= max){
                max = freq[i];
            }
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i] == max){
               cnt+=freq[i];
            }
        }
        return cnt;
    }
}