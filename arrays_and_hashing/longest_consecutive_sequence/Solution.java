import java.util.Map;
import java.util.HashMap;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 2) return nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 1);
        int answ = 1;
        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];
            if (map.containsKey(n)) continue;
            int l = map.getOrDefault(n - 1, 0);
            int r = map.getOrDefault(n + 1, 0);
            int s = l + r + 1;
            if (l + r == 0) {
                map.put(n, s);
            } else {
                map.put(n - l, s);
                map.put(n + r, s);
                if (l != 0 && r != 0) map.put(n, s);
            }
            
            if (s > answ) answ = s;
        }
        return answ;
    }
}
