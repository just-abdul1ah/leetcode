public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int i : piles)
            if (i > max) max = i;
        if (h == piles.length) return max;
        int start = 1;
        int end = max;
        int answ = 1;
        while (start <= end) {
            int k = (start + end) / 2;
            int sum = 0;
            for (int i : piles) {
                if (i % k > 0)
                    sum++;
                sum += i / k;
                if (sum > h) break;
            }
            if (sum > h) start = k + 1;
            else {
                end = k - 1;
                answ = k;
            }
        }
        return answ;
    }
}
