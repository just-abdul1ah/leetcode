public class Solution {
    public int trap(int[] height) {
        if (height.length == 1) return 0;
        int i = 0;
        int j = height.length - 1;
        int h = 0;
        int answ = 0;
        while (i < j) {
            int hi = height[i];
            int hj = height[j];
            int minh = Math.min(hi, hj);
            if (minh < h) answ += h - minh;
            else h = minh;
            if (hi >= hj) j--;
            else i++;
        }
        return answ;
    }
}
