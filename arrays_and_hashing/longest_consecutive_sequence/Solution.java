import java.util.*;

public class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length < 2) return nums.length;
        Set<Integer> set = new HashSet<>();
        for (int n : nums)
            set.add(n);
        int answ = 1;
        for (int n : set) {
            if (!set.contains(n - 1)) {
                int c = 1; n++;
                while (set.contains(n++))
                    c++;
                if (c > answ) answ = c;
            }
        }
        return answ;
    }
}
