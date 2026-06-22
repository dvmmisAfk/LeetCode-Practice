class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int x=0;
        int i=0;
        for(int j =0;j<nums.length;j++)
        {
            if(nums[j]==target)
            {
            x=(int)Math.abs(j-start);
            i=j;
            break;
            }
        }
        for(int j =i+1;j<nums.length;j++)
        {
            if(nums[j]==target)
            {
                x=Math.min(x,(int)Math.abs(j-start));
            }
        }
     return x;
    }
}