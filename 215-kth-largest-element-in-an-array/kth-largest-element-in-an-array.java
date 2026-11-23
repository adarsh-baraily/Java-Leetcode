class Solution {
    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;
        quicksort(nums, 0, nums.length - 1, target);
        return nums[target];
    }
    private void quicksort(int nums[], int low, int high, int target) {
        if(low < high) {

            int pindex = pivothere(nums, low, high);
            if(pindex == target) {
                return;
            }
            else if( pindex > target ) {
                quicksort(nums, low, pindex - 1, target);
            }
            else {
                quicksort(nums, pindex + 1, high, target);
            }
                
            
        }
    }
    private int pivothere(int nums[], int low, int high) {
        int pivot = nums[low];
        int i = low;
        int j = high;
        while(i < j) {
            while(nums[i] <=  pivot && i<= high - 1) {
                    i++;
                }
                while(nums[j] > pivot && j >= low + 1) {
                    j--;
                }
                if(i < j) {
                    int temp = nums[i];
                     nums[i] = nums[j];
                    nums[j] = temp;
                }
        }

        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;    
                        
    }
}