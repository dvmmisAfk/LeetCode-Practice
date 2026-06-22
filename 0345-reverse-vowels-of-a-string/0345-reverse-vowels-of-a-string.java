class Solution {
    public String reverseVowels(String s) {
        int left = 0 ; 
        char[] chars = s.toCharArray();
        int right = chars.length-1;

        while(left<right)
        {
            while ( left<right && !isvowel(chars[left]))
            left++;

            while ( left < right && !isvowel(chars[right]))
            right--;

                if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(chars);
    }

    private boolean isvowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}

