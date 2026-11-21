class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int temp = 0;
        for(int i = 0; i <= n-2; i++) {
            int min = i;
            for(int j = i; j <= n-1; j++) {
                if(nums[j] < nums[min]) {
                    min = j;
                }
            }
            temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }
}