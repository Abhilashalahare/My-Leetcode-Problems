class Solution {
    public int findContentChildren(int[] g, int[] s) {
        boolean used[] = new boolean[s.length];
        Arrays.sort(g);
        Arrays.sort(s);
        int count=0;
        for(int i=0; i<s.length;i++){
            for(int j=0;j<g.length; j++){

            
            if(s[i]>=g[j] && !used[j]){
                count++;
                used[j]= true;
                break;
                
            }
            }
        }
        return count;
    }
}