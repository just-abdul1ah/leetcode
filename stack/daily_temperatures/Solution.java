public class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answ = new int[n];
        int hottest = temperatures[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            int t = temperatures[i];
            if (t >= hottest) {
                hottest = t;
                continue;
            }

            int days = 1;
            while (temperatures[i + days] <= t) {
                days += answ[i + days];
            }
            answ[i] = days;
        }
        return answ;
    }
}