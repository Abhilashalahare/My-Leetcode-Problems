class Solution {
    public int threeSumClosest(int[] arr, int target) {
          int n= arr.length;
        int result=0;
        Arrays.sort(arr);
        int MinDiff=Integer.MAX_VALUE;
     for(int i =0;i<n-2;i++){
        int left = i+1;
        int right=n-1;
        while(left<right){
            int sum = arr[i]+arr[left]+arr[right];
            int diff = Math.abs(sum-target);
            if(MinDiff > diff){
                MinDiff=diff;
                result=sum;
            }
            if(sum==target){
                return sum;
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
     }
     return result;   
    }
}