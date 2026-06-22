class Solution {
    public int largestAltitude(int[] gain) {
       int []alt = new int[gain.length+1];
       alt[0]=0;
       int flag=1; 
       for(int i=0;i<gain.length;i++)
       {
            alt[flag]=alt[i]+gain[i];
            flag++;
       } 
       int max=0;
       for(int i = 0 ; i < alt.length ; i++)
       {
        if(max<alt[i])
        max=alt[i];
       }
       return max;
    }
}