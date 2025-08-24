class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] news = new char[n];

        for (int i = 0; i < n; i++) {
            news[i] = s[n - 1 - i];  // reverse copy
        }

        //in-place ---copying to the original string
        for (int i = 0; i < n; i++) {
            s[i] = news[i];
        }
       
    }
}