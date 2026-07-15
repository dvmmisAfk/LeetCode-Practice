class Solution {
    public int maxOperations(int[] nums, int k) {
        int start = 0;
        Arrays.sort(nums);
        int end = nums.length - 1;
        int count = 0;
        while (start < end) {
            if (nums[start] + nums[end] == k) {
                start++;
                end--;
                count++;
            } else if (nums[start] + nums[end] > k) {
                end--;
            } else
                start++;
        }
        return count;
    }
}
