class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> reviewed = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(reviewed.contains(nums[i])) {
                return true;
            } else {
            reviewed.add(nums[i]);
            }
        }
        return false;
    }
}