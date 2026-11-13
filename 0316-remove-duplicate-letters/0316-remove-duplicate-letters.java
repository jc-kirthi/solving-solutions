class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (stack.contains(c)) {
                continue;
            }

            while (!stack.isEmpty() && stack.peek() > c && s.indexOf(stack.peek(), i) != -1) {
                stack.pop();
            }

            stack.push(c);
        }

        String res = "";
        for (char c : stack) {
            res += c;
        }
        return res;
    }
}
