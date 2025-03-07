class Solution {
    public int[] closestPrimes(int left, int right) {
       List<Integer> primes = new ArrayList<>();

        // Find all prime numbers in the range
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        // If less than 2 primes exist, return [-1, -1]
        if (primes.size() < 2) return new int[]{-1, -1};

        // Find the closest prime pair
        int minDiff = Integer.MAX_VALUE;
        int num1 = -1, num2 = -1;

        for (int i = 0; i < primes.size() - 1; i++) {
            int diff = primes.get(i + 1) - primes.get(i);
            if (diff < minDiff) {
                minDiff = diff;
                num1 = primes.get(i);
                num2 = primes.get(i + 1);
            }
        }

        return new int[]{num1, num2};


        
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}