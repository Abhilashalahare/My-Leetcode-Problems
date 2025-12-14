class Solution {
    public List<String> topKFrequent(String[] words, int k) {
         Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++){
            String s = words[i];
            map.put(s, map.getOrDefault(s,0)+1); //store freq of words in map 
        }

        PriorityQueue<String> pq = new PriorityQueue<>( (a, b) -> {
                if (map.get(a).equals(map.get(b))) {
                    return a.compareTo(b);   // lexicographical order
                }
                return map.get(b) - map.get(a); // higher frequency first
            });
        for(String key : map.keySet()){
            pq.add(key); 
        }

     
        
        List<String> ans = new ArrayList<>();
        for(int i=0; i<k; i++){
            ans.add(pq.poll());
        }

        
        
       return ans;
    }
}