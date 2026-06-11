mport java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateAll("", 0, n, res);
        return res;
    }
    void generateAll(String s, int pos, int n, List<String> res) {
        if (pos == 2 * n) {
            if (isValid(s)) {
                res.add(s);
            }
            return;
        }
        generateAll(s + "(", pos + 1, n, res);
        generateAll(s + ")", pos + 1, n, res);
    }
    boolean isValid(String s) {
        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return balance == 0;
    }
}
