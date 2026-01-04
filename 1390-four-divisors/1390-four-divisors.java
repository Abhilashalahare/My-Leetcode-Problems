class Solution {

    public int sumFourDivisors(int[] nums) {
        int finalSum = 0;

        for (int i = 0; i < nums.length; i++) {

            finalSum += countDivisor(nums[i]);

        }

        return finalSum;
    }

    public int countDivisor(int n) {
        int cnt = 0;
        int sum = 0;

        for (int i = 1; i * i <= n; i++) { //optimized 
            if (n % i == 0) {

                int d1 = i;
                int d2 = n / i;

                if (d1 == d2) {
                    cnt++;
                    sum += d1;
                } else {
                    cnt += 2;
                    sum += d1 + d2;
                }

                if (cnt > 4)
                    return 0; // early exit
            }
        }

        if (cnt == 4)
            return sum;

        return 0;

    }
}