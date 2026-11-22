class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String t = tokens[i];
            if (t.equals("+") || t.equals("-") || t.equals("/") || t.equals("*")) {
                int a = s.pop();
                int b = s.pop();
                int sum = 0;
                
                if (t.equals("+")) sum = b + a;
                else if (t.equals("-")) sum = b - a;
                else if (t.equals("*")) sum = b * a;
                else if (t.equals("/")) sum = b / a;
                
                s.push(sum);
            } else {
                s.push(Integer.parseInt(t));
            }
        }
        return s.peek();
    }
}
