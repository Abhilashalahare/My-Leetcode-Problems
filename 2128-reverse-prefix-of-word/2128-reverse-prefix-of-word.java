class Solution {
    public String reversePrefix(String word, char ch) {
        int index = -1;
        
        // Find the first occurrence of the character `ch`
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        
        // If `ch` is not found, return the original word
        if (index == -1) {
            return word;
        }
        
        // Convert the string to a character array for in-place modification
        char[] charArray = word.toCharArray();
        reverseString(charArray, 0, index);
        
        return new String(charArray);
    }

    void reverseString(char[] s, int low, int high) {
        while (low < high) {
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;

            low++;
            high--;
        }
    }
}
