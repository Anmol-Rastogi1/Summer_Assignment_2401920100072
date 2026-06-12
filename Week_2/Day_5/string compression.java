lass Solution {
    public int compress(char[] chars) {
        int write = 0, i = 0;
        while (i < chars.length) {
            char ch = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == ch) {
                i++;
                count++;
            }
            chars[write++] = ch;
            if (count > 1) {
                String s = count + "";
                for (int j = 0; j < s.length(); j++) {
                    chars[write++] = s.charAt(j);
                }
            }
        }
        return write;
    }
}
