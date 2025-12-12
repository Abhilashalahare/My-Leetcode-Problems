class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          Map<String, List<String>> map = new HashMap<>();

          for(int i=0; i<strs.length; i++){
            char ch[] = strs[i].toCharArray();

            Arrays.sort(ch);
            // convert into string
            String sortedStrKey = new String(ch);
            if(!map.containsKey(sortedStrKey)){
                map.put(sortedStrKey, new ArrayList<>());
            }
            map.get(sortedStrKey).add(strs[i]);
          }
          List<List<String>> ans = new ArrayList<>(map.values());
          return ans;
    }
}