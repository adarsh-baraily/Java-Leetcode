class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> ins = new HashSet<>();
        for(int i = 0; i < nums1.length; i++) {
            for(int j = 0; j < nums2.length; j ++) {
                if(nums1[i] == nums2[j]) {
                    ins.add(nums1[i]);
                    ins.add(nums2[j]);
                }
            }
        }
        int[] result = new int[ins.size()];
        int p = 0;
        for(int k : ins) {
            result[p] = k;
            p = p + 1;
        }
        return result;
    }
}