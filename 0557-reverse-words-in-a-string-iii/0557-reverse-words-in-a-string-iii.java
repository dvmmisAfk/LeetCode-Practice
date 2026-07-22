class Solution {
    public String reverseWords(String s) {
    String arr[] = s.split(" ");
    String ans="";
    for(int i=0;i<arr.length;i++){
        String temp = arr[i];
        String rev_temp="";
            for(int j = 0 ; j <temp.length();j++){
                char t = temp.charAt(j);
                rev_temp = t + rev_temp;
            }
            ans = ans+rev_temp +" ";
    }        
    return ans.trim();
    }
}