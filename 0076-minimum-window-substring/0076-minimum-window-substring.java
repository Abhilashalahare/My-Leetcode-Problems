class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()) return "";

        int r=0; int l=0; int cnt=0; int sidx=-1;//strting indx
        int minLen = Integer.MAX_VALUE;
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<t.length(); i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)+1); //a=1,b=1,c=1
        }

        while(r<s.length()){
            if(map.containsKey(s.charAt(r))){
            if(map.get(s.charAt(r))>0){
                cnt++;
            }
            //a=1 tha to cnt++ hogya ab usko htana h taki firse a aane pe cnt++ na ho
            map.put(s.charAt(r),map.get(s.charAt(r))-1);
            }

            while(cnt == t.length()){
                if(r-l+1 < minLen){
                    minLen = r-l+1;
                    sidx = l;
                }
          
                if(map.containsKey(s.charAt(l))){
                       map.put(s.charAt(l),map.get(s.charAt(l))+1); 
                    if(map.get(s.charAt(l))>0){
                        cnt--; //shrint krte time abc me se koi ayega to cnt-- hojayega
                    }
                }
                l++;
            }
            r++;
        }
        return sidx == -1? "" : s.substring(sidx,sidx+minLen);

    }
}