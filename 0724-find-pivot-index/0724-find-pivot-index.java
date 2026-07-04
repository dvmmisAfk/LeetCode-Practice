class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==1)
        return 0;
        int index=-1;
        for(int i=0;i<nums.length;i++){
        int sum_left=0;
        int sum_right=0;
            for(int j=0;j<i;j++){
                sum_left+=nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                sum_right+=nums[k];
            }
            if(sum_left==sum_right){
            index=i;
            break;
            }
        }
        return index;
    }
}