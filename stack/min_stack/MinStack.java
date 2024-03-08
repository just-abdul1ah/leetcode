import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> mins;

    public MinStack() {
        stack = new Stack<>();
        mins = new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (mins.empty() || val < mins.peek())
            mins.push(val);
        else mins.push(mins.peek());
    }
    
    public void pop() {
        mins.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}
