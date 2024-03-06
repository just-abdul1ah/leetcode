import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        } // O(n)
        LinkedList<Integer>[] freq = new LinkedList[nums.length + 1];
        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            int v = e.getValue();
            if (freq[v] == null) freq[v] = new LinkedList<>();
            freq[v].add(e.getKey());
        }
        int j = 0;
        int[] answ = new int[k];
        for (int i = freq.length - 1; i > 0 && j < k; i--) {
            if (freq[i] == null) continue;
            while (j < k && freq[i].size() != 0) {
                answ[j++] = freq[i].poll();
            }
        }
        return answ;
    }
}
