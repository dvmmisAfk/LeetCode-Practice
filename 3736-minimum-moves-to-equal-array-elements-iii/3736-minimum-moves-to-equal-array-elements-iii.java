class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        for(int i=1 ; i<nums.length ; i++)
        {
            if(max<nums[i])
            max=nums[i];
        }
        int min_moves=0;
        for(int i=0 ; i<nums.length ;i++)
        {
            min_moves=min_moves+(max-nums[i]);
        }
        return min_moves;
    }
}