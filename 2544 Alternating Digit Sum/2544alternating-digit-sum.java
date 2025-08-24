class Solution {
    public int alternateDigitSum(int n) {
        String s = Integer.toString(n); // convert to string
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0'; //string to number(num's ascii - o's ascii--->48)
            if (i % 2 == 0) {
                sum += digit; // add for even index
            } else {
                sum -= digit; // subtract for odd index
            }
        }

        return sum;
    }
}
