import java.util.*;

public class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Entry> stack = new Stack<>();
        int n = heights.length;
        int answ = 0;
        stack.push(new Entry(heights[0], 0));
        for (int i = 1; i < n; i++) {
            int h = heights[i];
            int j = i;
            while (!stack.empty() && h < stack.peek().getH()) {
                Entry e = stack.pop();
                int a = e.getH() * (i - e.getI());
                if (a > answ) answ = a;
                j = e.getI();
            }
            stack.push(new Entry(h, j));
        }
        while (!stack.empty()) {
            Entry e = stack.pop();
            int a = e.getH() * (n - e.getI());
            if (a > answ) answ = a;
        }
        return answ;
    }

    public class Entry {
        private int h;
        private int i;

        Entry(int h, int i) {
            this.h = h;
            this.i = i;
        }

        int getH() { return h; }
        int getI() { return i; }
    }
}
