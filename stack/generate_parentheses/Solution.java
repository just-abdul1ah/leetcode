import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ls = new ArrayList<>();
        combinations(ls, "(", n - 1, n);
        return ls;
    }

    void combinations(List<String> ls, String s, int o, int c) {
        if (o + c == 0) {
            ls.add(s);
            return;
        }
        if (o > 0) combinations(ls, s + "(", o - 1, c);
        if (c > o) combinations(ls, s + ")", o, c - 1);
    }
}
