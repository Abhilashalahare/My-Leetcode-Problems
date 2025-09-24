class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[10001];
        Stack<Integer> s = new Stack<>();
        for (int i = m - 1; i >= 0; i--) {
            while (!s.isEmpty() && s.peek() <= nums2[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                ans[nums2[i]] = -1;
            } else {
                ans[nums2[i]] = s.peek();
            }
            s.push(nums2[i]);

        }

        for (int i = 0; i < n; i++) {
            nums1[i] = ans[nums1[i]];
        }

        return nums1;
    }
}