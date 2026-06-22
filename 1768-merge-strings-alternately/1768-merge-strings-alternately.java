class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] c1 = word1.toCharArray();
        char[] c2 = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int idx1 = 0;
        int idx2 = 0;
        while(idx1 < c1.length || idx2 < c2.length) {
            if(idx1 < c1.length) {
                sb.append(c1[idx1++]);
            }
            if(idx2 < c2.length) {
                sb.append(c2[idx2++]);
            }
        }
        return sb.toString();
    }
}