class Solution {
    public String makeSmallestPalindrome(String s) {
    char[] arr = s.toCharArray();
    int left = 0, right = arr.length - 1;
    int ops = 0;
    while (left < right) {
        if (arr[left] != arr[right]) {
            if (arr[left] > arr[right]) {
                arr[left] = arr[right];
            } else {
                arr[right] = arr[left];
            }
            ops++;
        }
        left++;
        right--;
    }
    if (ops == 0) {
        return s;
    }
    return new String(arr);
}
}