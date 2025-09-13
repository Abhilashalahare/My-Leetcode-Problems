class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxVowel=0, maxConso=0;

        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

      for (Map.Entry<Character, Integer> entry : map.entrySet()) {
    char ch = entry.getKey();
    int val = entry.getValue();

    if (isVowel(ch)) {
        maxVowel = Math.max(maxVowel, val);
    } else {
        maxConso = Math.max(maxConso, val);
    }
}


        return maxVowel+maxConso;
    }


    boolean isVowel (int n){
        if(n=='a' || n=='i' || n=='o' || n=='e' || n=='u'){
            return true;
        }
        return false;
    }
}