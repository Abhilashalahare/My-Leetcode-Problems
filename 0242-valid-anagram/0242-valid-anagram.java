class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i< s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0 )+1);
        }

        for(int i=0; i<t.length(); i++){
          char ch = t.charAt(i);
          if(map.get(ch) != null){  
            if(map.get(ch)==1){ //freq=1->remove
                map.remove(ch);
            }else{
                map.put(ch,map.get(ch)-1);  //freq>1 put the value with subtracting 1 from it

            }
          }else{
            return false;
          }
        }
        return map.isEmpty();
    }
}