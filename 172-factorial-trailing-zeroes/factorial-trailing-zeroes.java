class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        
        // Count how many multiples of 5, 25, 125, etc., are less than or equal to n
        while (n >= 5) {
            count += n / 5;
            n = n / 5;
        }
        
        return count;
    }
}
