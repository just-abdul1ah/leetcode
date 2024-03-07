public class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] c = s.toLowerCase().toCharArray();
        while (i < j) {
            while (!isValid(c[i]) && i < j) i++;
            while (!isValid(c[j]) && i < j) j--;
            if (c[i] != c[j]) return false;
            i++; j--;
        }
        return true;
    }

    static boolean isValid(char c) {
        return Character.isAlphabetic(c) || Character.isDigit(c);
    }
}
