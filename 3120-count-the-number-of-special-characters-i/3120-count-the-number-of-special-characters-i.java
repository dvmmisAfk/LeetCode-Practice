class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set= new HashSet<>();
        for(int i = 0 ; i<word.length();i++){
            char ch = word.charAt(i);
            set.add(ch);
        }
        int count=0;
        for(char c:set){
        if(c>='A' && c<='Z' && set.contains(Character.toLowerCase(c))){
                count++;
            }
        }
        return count;
    }
}