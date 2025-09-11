class Solution {
    public String sortVowels(String s) {
        int cntV = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int j = 0; j < s.length(); j++) {
            char i = s.charAt(j);
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'A' || i == 'E' || i == 'I' || i == 'O'  || i == 'U')
                cntV++;
        }
        int k=0;
        char[] v = new char[cntV];
       for (int j = 0; j < s.length(); j++) {
            char i = s.charAt(j);
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'A' || i == 'E' || i == 'I' || i == 'O'  || i == 'U')
               {
                 v[k] = i;
                k++;
               }
        }

        Arrays.sort(v);
       int l=0;
     for (int j = 0; j < s.length(); j++) {
            char i = s.charAt(j);
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'A' || i == 'E' || i == 'I' || i == 'O'  || i == 'U')
             sb.append(v[l++]);
            else
            sb.append(i);
                
        }

        return sb.toString();

    }
}