import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            int j = target - nums[i];
            if (map.containsKey(j)) return new int[]{i, map.get(j)};
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
