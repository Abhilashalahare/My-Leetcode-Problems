class Solution {
    public int[] searchRange(int[] nums, int target) {
        int st=0;
        int end=nums.length-1;
        int fi=-1;
        int li=-1;

        //find 1st idx
        while(st<=end){
            int mid = (st+end)/2;
           
            if(nums[mid]==target){
                 fi=mid;
            end=mid-1;
            }
        else if(nums[mid]>target){
            end=mid-1;
        }else{
            st=mid+1;
        }
        }

        st=0;
        end=nums.length-1;
        //last indx
        while(st<=end){
            int mid=(st+end)/2;

            if(nums[mid]==target){
                li=mid;
                st=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                st = mid+1;
            }  
        }
           return new int[]{fi,li};

    }
}