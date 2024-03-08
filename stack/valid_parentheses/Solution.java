import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else 
                if (stack.empty() || stack.pop() != opposite(c))
                    return false;
        }
        return stack.empty();
    }

    char opposite(char c) {
        if (c == ')') return '(';
        if (c == ']') return '[';
        return '{';
    }
}
