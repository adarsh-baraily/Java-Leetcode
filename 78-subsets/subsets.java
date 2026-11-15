class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, nums, new ArrayList<>(), ans);
        return ans;
    }

    private void helper(int i, int[] nums, List<Integer> ds, List<List<Integer>> ans) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[i]);
        helper(i + 1, nums, ds, ans);

        ds.remove(ds.size() -1);
        helper(i + 1, nums, ds, ans);
        
    }
}
       