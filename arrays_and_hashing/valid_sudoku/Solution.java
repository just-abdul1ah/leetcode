import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[board.length];
        Set<Character>[] columns = new HashSet[board.length];
        Set<Character>[] buckets = new HashSet[board.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                if (rows[i] == null) rows[i] = new HashSet<>();
                if (!rows[i].add(c)) return false;
                if (columns[j] == null) columns[j] = new HashSet<>();
                if (!columns[j].add(c)) return false;
                int index = (i / 3) * 3 + (j / 3);
                if (buckets[index] == null) buckets[index] = new HashSet<>();
                if (!buckets[index].add(c)) return false;
            }
        }
        return true;
    }
}
