class Solution {
     public int beautySum(String s) {
        int totalBeauty = 0;
        
        // Loop over all possible starting points of substrings
        for (int i = 0; i < s.length(); i++) {
            // Use a HashMap to store character frequencies for the current substring
            HashMap<Character, Integer> freqMap = new HashMap<>();
            
            // Extend the substring from starting point `i` to the end
            for (int j = i; j < s.length(); j++) {
                // Add current character to the frequency map
                char c = s.charAt(j);
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
                
                // Calculate the beauty for the current substring
                totalBeauty += calculateBeauty(freqMap);
            }
        }
        
        return totalBeauty;
    }
    
    // Helper function to calculate beauty of a substring from the frequency map
    private int calculateBeauty(HashMap<Character, Integer> freqMap) {
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        
        // Iterate through the frequency map to find min and max frequency
        for (int freq : freqMap.values()) {
            maxFreq = Math.max(maxFreq, freq);
            minFreq = Math.min(minFreq, freq);
        }
        
        // Return the difference between max and min frequencies
        // If all characters are the same, minFreq == maxFreq, so beauty is 0
        return maxFreq - minFreq;
    }
    
}