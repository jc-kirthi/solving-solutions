class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        
        // Pointers for the rightmost digits of both strings
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        
        // Loop as long as there are digits to process or a carry remains
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            
            // Extract digit from num1 if available
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            
            // Extract digit from num2 if available
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }
            
            // Append the last digit of the current sum
            result.append(sum % 10);
            
            // Calculate the new carry (either 0 or 1)
            carry = sum / 10;
        }
        
        // Since we added digits from right to left, the result is backwards
        return result.reverse().toString();
    }
}
