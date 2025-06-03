class Solution {
    public String mergeAlternately(String s1, String s2) {

        int n=s1.length();
        int m=s2.length();

        int l=0; int r=0;
 
        StringBuilder sb = new StringBuilder();

        while(l<n && r<m){
            sb.append(s1.charAt(l++));
            sb.append(s2.charAt(r++));
        }

        while(l<n){
             sb.append(s1.charAt(l++));
        }
        
        while(r<m){
            sb.append(s2.charAt(r++));
        }

        return sb.toString();
    }
}