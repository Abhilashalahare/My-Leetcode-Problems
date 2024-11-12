class Solution {
    public int myAtoi(String s) {
          // Step 1: Ignore leading whitespaces
        int index = 0;
        int n = s.length();
        while (index < n && s.charAt(index) == ' ') {
            index++;
        }

        // Step 2: Determine the sign
        int sign = 1;
        if (index < n && s.charAt(index) == '-') {
            sign = -1;
            index++;
        } else if (index < n && s.charAt(index) == '+') {
            index++;
        }

        // Step 3: Convert the digits to an integer
        int result = 0;
        while (index < n && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            
            // Check for overflow before adding the next digit
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        // Step 4: Apply the sign and return the result
        return result * sign;
    }
}