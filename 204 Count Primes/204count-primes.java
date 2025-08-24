

class Solution {
    public int countPrimes(int n) {
       
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        int c = 0;
//Sieve of Eratosthenes
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                c++; 
                //to remove i's multiples 
                for (int j = i * 2; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return c;
    }
}

/**Brute-force method
class Solution {
    public int countPrimes(int N) {
        int c = 0; // prime counter

        for (int n = 2; n < N; n++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break; // stop after first divisor
                }
            }
            if (isPrime) c++;
        }
        return c;
    }
}
*/