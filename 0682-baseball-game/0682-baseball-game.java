

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> r = new Stack<>();
        
        for (String op : operations) { 
            if (op.equals("+")) {
                int top = r.pop();      // Get the last valid score
                int newTop = top + r.peek(); // Add it to the second-to-last score
                r.push(top);            // Put the last score back
                r.push(newTop);         // Put the new score on top
            } 
            else if (op.equals("D")) {
                r.push(2 * r.peek());   
            } 
            else if (op.equals("C")) {
                r.pop();               
            } 
            else {
                r.push(Integer.parseInt(op));
            }
        }

        int s = 0;
        while (!r.isEmpty()) {
            s += r.pop();
        }
        return s;
    }
}
