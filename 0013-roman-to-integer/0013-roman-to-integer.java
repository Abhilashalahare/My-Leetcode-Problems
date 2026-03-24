class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans =0;

        if(s.length()==1) return ans += map.get(s.charAt(0));

        for(int i=0; i<s.length()-1; i++){
            char c = s.charAt(i);
            char c1 = s.charAt(i+1);

            if(map.get(c) >= map.get(c1)){
                ans += map.get(c);
            }else{
                ans -= map.get(c);
            }
        }

        ans += map.get(s.charAt(s.length()-1));

        return ans;
    }
}