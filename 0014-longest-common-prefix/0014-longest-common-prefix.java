class Solution {
    public String longestCommonPrefix(String[] strs) {
        int plen = 0;
        if (strs.length == 0) return "";

        while (plen < strs[0].length()) {
            char ch = strs[0].charAt(plen);
            boolean allwell = true;

            for (int i = 1; i < strs.length; i++) {
                if (plen >= strs[i].length() || strs[i].charAt(plen) != ch) {
                    allwell = false;
                    break;
                }
            }

            if (!allwell) break;
            plen++;
        }

        return strs[0].substring(0, plen);
    }
}
