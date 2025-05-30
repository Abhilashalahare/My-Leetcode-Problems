public class Solution {
    public int nextGreaterElement(int n) {
        // Step 1: Convert to char array for manipulation
        char[] digits = Integer.toString(n).toCharArray();
        int len = digits.length;
        int ind = -1;

        // Step 2: Find the first decreasing element from the right
        for (int i = len - 2; i >= 0; i--) {
            if (digits[i] < digits[i + 1]) {
                ind = i;
                break;
            }
        }

        // If no such element, no greater permutation exists
        if (ind == -1) return -1;

        // Step 3: Find the next greater digit on the right
        for (int i = len - 1; i > ind; i--) {
            if (digits[i] > digits[ind]) {
                swap(digits, i, ind);
                break;
            }
        }

        // Step 4: Reverse the suffix
        reverse(digits, ind + 1, len - 1);

        // Step 5: Convert back to number using long to detect overflow
        long result = Long.parseLong(new String(digits));
        return (result <= Integer.MAX_VALUE) ? (int) result : -1;
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(char[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
        }
    }
}
