class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int nmax=(nums[0]-1)*(nums[1]-1);
        int pmax=(nums[n-1]-1)*(nums[n-2]-1);
        return Math.max(nmax, pmax);
    }
}