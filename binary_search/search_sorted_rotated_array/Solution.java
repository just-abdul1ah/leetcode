public class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length - 1;
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] >= nums[n]) {
                if (target < nums[mid] && target >= nums[0]) end = mid - 1;
                else start = mid + 1;
            } else {
                if (target > nums[mid] && target <= nums[n]) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    } 
}
