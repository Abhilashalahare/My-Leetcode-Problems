class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m+n];
        int i=0; int j=0;
        int idx=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[idx]=nums1[i];
                i++;
                idx++;
            }else{
                arr[idx]=nums2[j];
                j++;
                idx++;
            }
        }
        while(i<m){
            arr[idx]=nums1[i];
            i++;
            idx++;

        }
        while(j<n){
            arr[idx]=nums2[j];
            j++;
            idx++;
        }
        for( i=0; i<m+n;i++){
            nums1[i] = arr[i];
        }
        return;

        }
       
            
        
        
    }