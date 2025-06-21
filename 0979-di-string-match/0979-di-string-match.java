class Solution {
    public int[] diStringMatch(String s) {
        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        int cnt = 0;

        for (int i = 0; i < s.length() + 1; i++) {
            st.push(cnt);
            cnt++;
            if (i == s.length() || s.charAt(i) == 'I') {
                while (!st.isEmpty()) {
                    arr.add(st.pop());
                }

            }
        }

        int[] result = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            result[i] = arr.get(i);
        }

        return result;
    

    }
}