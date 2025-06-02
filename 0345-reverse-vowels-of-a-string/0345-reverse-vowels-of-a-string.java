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
    if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'|| c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
        return true;
    }else{
        return false;
    }
  }

    }