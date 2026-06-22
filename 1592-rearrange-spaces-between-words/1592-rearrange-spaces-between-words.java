import java.util.*;

class Solution {
    public String reorderSpaces(String text) {
        int space = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                space++;
        }

        StringTokenizer str = new StringTokenizer(text);
        int words = str.countTokens();

        if (space == 0)
            return text;

        
        if (words == 1) {
            return str.nextToken() + " ".repeat(space);
        }

        int btw = space / (words - 1);
        int rem = space % (words - 1);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words; i++) {
            result.append(str.nextToken());

            // Add spaces only between words
            if (i < words - 1)
                result.append(" ".repeat(btw));
        }

        result.append(" ".repeat(rem));

        return result.toString();
    }
}