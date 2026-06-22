import java.util.*;
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> index = new ArrayList<Integer>();
        for ( int i = 0 ; i < words.length;i++)
        {
            String str = words[i];
            for(int j = 0 ; j < str.length();j++)
            {
                char temp = str.charAt(j);
                if(temp == x)
                {
                    index.add(i);
                    break;
                }
            }
        }
        return index;
    }
}