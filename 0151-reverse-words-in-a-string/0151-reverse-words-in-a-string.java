class Solution {
    public String reverseWords(String s) {
           
        String[] arr = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--){
            String str = arr[i];
            if (str.isBlank()) continue;//for inbetween spaces
            
            sb.append(str);
            if (i != 0) sb.append(" "); //last word 
        }
        return sb.toString();
    }
}