public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answ = new int[nums.length];
        int p = 1;
        for (int i = 0; i < nums.length; i++) {
            answ[i] = p;
            p *= nums[i];
        }
        p = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answ[i] = p * answ[i];
            p *= nums[i];
        }
        return answ;
    }
}