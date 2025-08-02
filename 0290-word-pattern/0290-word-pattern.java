class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        int len = words.length;

        if (len != pattern.length()) {
            return false;
        }

        Map<Character, String> mapP = new HashMap<>();
        Map<String, Character> mapS = new HashMap<>();

        for (int i = 0; i < len; i++) {
            String word = words[i];
            char ch = pattern.charAt(i);

            if (!mapP.getOrDefault(ch, word).equals(word)) {
                return false;
            }
            if (!mapS.getOrDefault(word, ch).equals(ch)) {
                return false;
            }

            mapP.put(ch, word);
            mapS.put(word, ch);
        }

        return true;
    }
}