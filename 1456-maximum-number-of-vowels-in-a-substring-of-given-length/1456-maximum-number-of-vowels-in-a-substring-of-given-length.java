class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;

        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            switch (s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }

        int max = count;
        if (max == k) return k;

        for (int i = k; i < s.length(); i++) {

            switch (s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }

            switch (s.charAt(i - k)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count--;
            }

            if (count > max) {
                max = count;
                if (max == k) return k;
            }
        }

        return max;
    }
}