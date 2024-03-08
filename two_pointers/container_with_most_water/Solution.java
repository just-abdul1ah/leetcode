public class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int answ = 0;
        while (i < j) {
            int hi = height[i];
            int hj = height[j];
            int a = Math.min(hi, hj) * (j - i);
            if (a > answ) answ = a;
            if (hi >= hj) j--;
            else i++;
        }
        return answ;
    }
}