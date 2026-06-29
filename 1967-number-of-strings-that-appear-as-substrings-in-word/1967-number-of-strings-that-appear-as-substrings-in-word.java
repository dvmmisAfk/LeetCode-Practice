class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for(String i : patterns){  
        if(word.indexOf(i)!=-1)
               count++;
            }
        
        return count;
    }
}
