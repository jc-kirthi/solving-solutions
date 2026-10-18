class Solution {
    public boolean threeFibonacciSum(int n) {
        // Initialize our window with the first three Fibonacci terms: 0, 1, 1
        long a = 0;
        long b = 1;
        long c = 1;
        
        // Calculate the initial sum of our window
        long currentWindowSum = a + b + c;
        
        // Slide the window forward as long as the sum hasn't exceeded n
        while (currentWindowSum <= n) {
            if (currentWindowSum == n) {
                return true;
            }
            
            // Slide the window: Drop 'a' out, shift elements, generate the next Fibonacci number
            long nextFib = b + c; 
            a = b;
            b = c;
            c = nextFib;
            
            // Update the window sum dynamically
            currentWindowSum = a + b + c;
        }
        
        return false;
    }
}
