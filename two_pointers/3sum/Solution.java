import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> answ = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int a = nums[i];
            if (i > 0 && a == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int n = a + nums[j] + nums[k];
                if (n > 0) k--;
                else if (n < 0) j++;
                else {
                    answ.add(Arrays.asList(a, nums[j], nums[k]));
                    j++;
                    while (nums[j] == nums[j - 1] && j < k)
                        j++;
                }
            }
        }
        return answ;
    }
}