class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            String p1 = expand(s, i, i);
            String p2 = expand(s, i, i + 1);
            String best = (p1.length() > p2.length()) ? p1 : p2;
            if (best.length() > ans.length()) {
                ans = best;
            }
        }
        return ans;
    }
    private String expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return s.substring(l + 1, r);
    }
}
