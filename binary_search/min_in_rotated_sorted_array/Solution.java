public class Solution {
    public int findMin(int[] nums) {
        int n = nums.length - 1;
        if (nums[0] <= nums[n]) return nums[0];
        int s = 0;
        int e = n;
        int answ = 0;
        while (s <= e) {
            int mid = (s + e) / 2;
            if (nums[mid] >= nums[0]) s = mid + 1;
            else {
                answ = nums[mid];
                e = mid - 1;
            }
        }
        return answ;
    }
}
