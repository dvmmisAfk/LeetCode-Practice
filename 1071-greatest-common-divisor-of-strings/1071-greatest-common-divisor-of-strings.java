class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
        return "";
        int len1=str1.length();
        int len2=str2.length();
        int result = Math.min(len1, len2);
        while (result > 0) {
            if (len1 % result == 0 && len2 % result == 0) {
                break;
            }
            result--;
        }

        String f = str1.substring(0,result);
        return f;
    }
}
