class Solution {
      public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        
        int start = 0, end = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes with center i
            int len1 = expandFromCenter(s, i, i);
            
            // Check for even-length palindromes with center between i and i+1
            int len2 = expandFromCenter(s, i, i + 1);
            
            // Choose the longer palindrome length
            int len = Math.max(len1, len2);
            
            // Update start and end indices if we found a longer palindrome
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        
        // Extract and return the longest palindrome substring
        return s.substring(start, end + 1);
    }
    
    // Helper method to expand from center and find palindrome length
    private static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        // Length of palindrome is right - left - 1
        return right - left - 1;
    }
}