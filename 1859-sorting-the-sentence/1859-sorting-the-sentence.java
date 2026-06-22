class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];

        for (String word : words) {
            int len = word.length();
            int pos = word.charAt(len - 1) - '1';  // Convert '1' to 0, '2' to 1, etc.
            result[pos] = word.substring(0, len - 1);  // Remove the number from the end
        }

        return String.join(" ", result);
    }
}
