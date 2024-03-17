public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length; int m = nums2.length;
        
        // make sure that nums1 is smaller of the two
        if (n > m)
            return findMedianSortedArrays(nums2, nums1);

        int total = n + m;
        int half = (total + 1) / 2; // left partition size
        int l = 0;
        int r = n;

        while (l <= r) {
            int mid = (l + r) / 2;
            int j = half - mid;

            double s_left = mid - 1 >= 0 ? nums1[mid - 1] : Integer.MIN_VALUE;
            double s_right = mid < n ? nums1[mid] : Integer.MAX_VALUE;
            double b_left = j - 1 >= 0 ? nums2[j - 1] : Integer.MIN_VALUE;
            double b_right = j < m ? nums2[j] : Integer.MAX_VALUE;

            // partition is correct
            if (s_left <= b_right && b_left <= s_right) {
                // even
                if ((n + m) % 2 == 0)
                    return (Math.max(s_left, b_left) + Math.min(s_right, b_right)) / 2;
                // odd
                else
                    return Math.max(s_left, b_left);
            } else if (s_left > b_right) r = mid - 1;
            else l = mid + 1;
        }
        return 0;
    }
}