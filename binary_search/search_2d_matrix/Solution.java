public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int r = searchRows(matrix, target, 0, m, n);
        if (r == -1) return false;
        return binSearch(matrix, target, r, 0, n);
    }

    int searchRows(int[][] mtx, int t, int s, int e, int n) {
        if (s > e) return -1;
        int mid = (s + e) / 2;
        if (mtx[mid][0] > t)
            return searchRows(mtx, t, s, mid - 1, n);
        else if (mtx[mid][n] < t)
            return searchRows(mtx, t, mid + 1, e, n);
        else return mid;
    }

    boolean binSearch(int[][] mtx, int t, int r, int s, int e) {
        if (s > e) return false;
        int mid = (s + e) / 2;
        if (mtx[r][mid] > t)
            return binSearch(mtx, t, r, s, mid - 1);
        else if (mtx[r][mid] < t)
            return binSearch(mtx, t, r, mid + 1, e);
        else return true;
    }
}
