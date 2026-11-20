class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        List<Integer> l1 = new ArrayList<>();
        for(int i : set1) {
            if(set2.contains(i) == false) {
                l1.add(i);
            }
        }
        List<Integer> l2 = new ArrayList<>();
        for(int i : set2) {
            if(set1.contains(i) == false) {
                l2.add(i);
            }
        }
        List<List<Integer>> l = new ArrayList<>();
        l.add(l1);
        l.add(l2);
        return l;
    }
}