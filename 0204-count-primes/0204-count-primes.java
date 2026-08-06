class Solution {

    public int countPrimes(int n) {
        if (n <= 2) return 0;

        boolean[] isPrime = new boolean[n];

       
        int count = 1;

        
        for (int i = 3; i < n; i += 2) {
            if (!isPrime[i]) {
                count++;

                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += 2 * i) {
                        isPrime[j] = true;
                    }
                }
            }
        }

        return count;
    }
}