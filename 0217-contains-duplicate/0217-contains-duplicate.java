class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();
        for(int i : nums){
            s.add(i);
        }
        if(s.size()==nums.length)
        return false;
        else
        return true;
    }
}