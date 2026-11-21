class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int j = 0;
        for(int i = 0; i <= n - 1; i++) {
            j = i;
            while( j > 0 && nums[j-1] > nums[j]) {
            int temp = nums[j-1];
            nums[j-1] = nums[j];
            nums[j] = temp;
            j = j - 1;
            }
        }
        return (nums[n - 1] - 1) * (nums[n - 2] - 1); 
    }
}