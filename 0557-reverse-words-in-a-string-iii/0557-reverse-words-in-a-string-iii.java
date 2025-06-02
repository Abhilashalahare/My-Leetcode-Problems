class Solution {
    public String reverseWords(String s) {
        int n = s.length();

        if (n == 1) return s;

        StringBuilder sb = new StringBuilder();

        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++) {  // fix here: use arr.length not n
            sb.append(reverse(arr[i]));
            if (i != arr.length - 1) sb.append(" ");  // fix here: add space after every word except the last one
        }

        return sb.toString();
    }

    String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l = 0;
        int r = sb.length() - 1;

        while (l < r) {
            char temp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, temp);
            l++;
            r--;
        }

        return sb.toString();
    }
}
