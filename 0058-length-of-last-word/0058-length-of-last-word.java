class Solution {
    public int lengthOfLastWord(String s) {
        int flag = 0;
        s = s.trim();
        for(int i = 0;i < s.length() ; i ++)
        if (s.charAt(i)==' ')
        {
            flag = i;
        }
        int lengthh =0 ;
        if (flag>0)
        {
        String lastword=s.substring(flag,s.length()-1);
        lengthh= lastword.length();
        }
        else if ( flag ==0)
        lengthh = s.length();
        return lengthh;
    }
}