class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
    int l = 0;
    int r = s.length() - 1;

    while (l < r) {
      while (l < r && !isVowel(sb.charAt(l))) l++;
      while (l < r && !isVowel(sb.charAt(r)))r--;
        if(l<r){
            char temp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, temp);
            l++;
            r--;
        }
      
    }
    

    return sb.toString();
  }

  public static boolean isVowel(char c){
    return "aeiouAEIOU".indexOf(c) != -1;

    }
}