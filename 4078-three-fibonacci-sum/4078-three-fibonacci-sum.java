class Solution {
    public boolean threeFibonacciSum(int n) {
        long a = 0;
        long b = 1;
        long c = 1;
        long currentWindowSum = a + b + c;
        
        while (currentWindowSum <= n) {
            if (currentWindowSum == n) {
                return true;
            }
            
            long nextFib = b + c; 
            a = b;
            b = c;
            c = nextFib;
            
            currentWindowSum = a + b + c;
        }
        
        return false;
    }
}
