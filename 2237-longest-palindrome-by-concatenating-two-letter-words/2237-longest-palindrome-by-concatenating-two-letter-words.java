class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> map = new HashMap<>();
        
        int result = 0;
        for(String word: words){
            String rev = new StringBuilder(word).reverse().toString();

            if(map.getOrDefault(rev, 0)>0){
                result += 4;
                map.put(rev, map.get(rev)-1);
            }else{
               map.put(word, map.getOrDefault(word, 0)+1);
            }
        
        } 

    //    loop in map
        for(Map.Entry<String, Integer> entry : map.entrySet()){
              String word = entry.getKey();
            int count = entry.getValue();

            if (word.charAt(0) == word.charAt(1) && count > 0) {
                result += 2; 
                break;
            }
        }

        return result;
    }

}