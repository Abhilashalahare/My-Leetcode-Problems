class Solution {
   public int nextGreaterElement(int n) {
    char[] digits = Integer.toString(n).toCharArray();

    int ind = -1;
    int len = digits.length;

    for (int i = len - 2; i >= 0; i--) {
        if (digits[i] < digits[i + 1]) {
            ind = i;
            break;
        }
    }

    if (ind == -1) return -1;

    for (int i = len - 1; i > ind; i--) {
        if (digits[i] > digits[ind]) {
            swap(digits, i, ind);
            break;
        }
    }

    reverse(digits, ind + 1, len - 1);

    // Safely convert to int
    int result = 0;
    for (char c : digits) {
        int digit = c - '0';
        if (result > (Integer.MAX_VALUE - digit) / 10) return -1;
        result = result * 10 + digit;
    }

    return result;
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