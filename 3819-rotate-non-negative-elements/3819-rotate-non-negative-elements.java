class Solution {
    public int[] rotateElements(int[] nums, int k) {
        List<Integer> nonNegValues = new ArrayList<>();
        for (int num : nums) {
            if (num >= 0) nonNegValues.add(num);
        }

        int m = nonNegValues.size();
        if (m == 0) return nums; 
        k = k % m;
        int idx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                nums[i] = nonNegValues.get((idx + k) % m);
                idx++;
            }
        }

        return nums;
    }
}