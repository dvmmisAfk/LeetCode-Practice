class Solution {
    public String processStr(String s) {

        int n = s.length();
        StringBuilder result = new StringBuilder(n * 2);

        for (int i = 0; i < n; i++) {

            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                result.append(ch);
            }
            else if (ch == '*') {
                if (result.length() > 0) {
                    result.setLength(result.length() - 1);
                }
            }
            else if (ch == '#') {
                String curr = result.toString();
                result.append(curr);
            }
            else { // ch == '%'
                result.reverse();
            }
        }

        return result.toString();
    }
}