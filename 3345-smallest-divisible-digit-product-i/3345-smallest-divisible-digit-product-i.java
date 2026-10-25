class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            int temp = n;
            int p = 1;
            
            // Calculate the digit product using the temporary variable
            while (temp != 0) {
                int r = temp % 10;
                p *= r;
                temp /= 10;
            }
            
            // Check if the product is divisible by t
            if (p % t == 0) {
                return n;
            }
            
            // If not, increment and try the next number
            n++;
        }
    }
}
