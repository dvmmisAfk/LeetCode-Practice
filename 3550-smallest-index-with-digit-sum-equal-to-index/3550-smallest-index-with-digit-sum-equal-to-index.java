class Solution {
    public int smallestIndex(int[] nums) {
    int flag=-1;
       for(int i = 0 ; i < nums.length;i++)
       {
        if(i==digitsum(nums[i]))
        {
            flag=i;
            break;
        }
       } 
       if(flag==-1)
        return flag;
        return flag;
    }
    public int digitsum(int n)
    {
        int s=0;
        for(int i = n;i!=0;i=i/10)
        s=s+(i%10);
        return s;
    }
}