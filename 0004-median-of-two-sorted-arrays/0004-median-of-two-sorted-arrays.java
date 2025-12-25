class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //o(m+n)
        int n=nums1.length;
        int m =nums2.length;
           int i=0; int j=0; int k=0;
        int arr[] = new int[m+n];
        int res=0;

        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                arr[k] = nums1[i];
                k++;
                i++;
            
            }else{
                arr[k] = nums2[j];
                k++;
                j++;

            }
          
        }

        while(i<n){
            arr[k] = nums1[i];
            k++;
            i++;
        }

        while(j<m){
            arr[k] = nums2[j];
            k++;
            j++;
        }
       
      int l=0, r=arr.length-1;
       
      
           int mid = l+(r-l)/2;

           if(arr.length%2 ==0){
            //even 
           return (arr[mid] + arr[mid+1]) / 2.0;
           }else{
            return arr[mid]; //java automatically treat it as double arr[mid] becoz of the return type
            // Java performs implicit type conversion from int → double
           }
       
        
    }
}