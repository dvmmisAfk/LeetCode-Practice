class Solution {
    public boolean canAliceWin(int[] nums) {
       int sum_single = 0 ;
       int sum_double = 0 ;
       for (int i = 0 ; i < nums.length ; i++) 
       {
        if(0<=nums[i]&& nums[i]<=9)
        sum_single += nums[i];

        if(10<=nums[i]&& nums[i]<=99)
        sum_double += nums[i];
       }
       if(sum_single != sum_double)
       return true;
       else 
       return false;
    }
}