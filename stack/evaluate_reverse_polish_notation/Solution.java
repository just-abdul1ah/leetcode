import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+"))
                stack.push(stack.pop() + stack.pop());
            else if (s.equals("-")) {
                int n = stack.pop();
                stack.push(stack.pop() - n);
            }
            else if (s.equals("*"))
                stack.push(stack.pop() * stack.pop());
            else if (s.equals("/")) {
                int n = stack.pop();
                stack.push(stack.pop() / n);
            }
            else
                stack.push(Integer.parseInt(s));
        }
        return stack.pop();
    }    
}
