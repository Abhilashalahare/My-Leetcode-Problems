public class Solution {
    public int reversePairs(int[] nums) {
        int res = mergesort(nums, 0, nums.length - 1);
        return res;
    }
    private int mergesort(int[] nums, int start, int end) {
        if (start >= end) {
            return 0;
        }
        int mid = (end - start) / 2 + start;
        int res = mergesort(nums, start, mid) + mergesort(nums, mid + 1, end);
        for (int i = start, j = mid + 1; i <= mid; i ++) {
            while (j <= end && (double)nums[i] / 2.0 > nums[j]) {
                j ++;
            }
            res += j - mid - 1;
        }
        merge(nums, start, mid, mid + 1, end);
        return res;
    }
    private void merge(int[] nums, int s1, int e1, int s2, int e2) {
        int[] result = new int[e2 - s1 + 1];
        int i = s1, j = s2, k = 0;
        while (i <= e1 || j <= e2) {
            long a = Long.MAX_VALUE;
            long b = Long.MAX_VALUE;
            if (i <= e1) {
                a = nums[i];
            }
            if (j <= e2) {
                b = nums[j];
            }
            if (a < b) {
                result[k++] = (int)a;
                i ++;
            }
            else {
                result[k++] = (int)b;
                j ++;
            }
        }
        for (k = 0; k < result.length; k ++) {
            nums[s1 + k] = result[k];
        }
    }
}