class Solution {
    public int heightChecker(int[] heights) {
        int temp = 0;
        int n = heights.length;
        int[] expected = heights.clone();
        for(int i = n - 1; i >= 1; i--) {
            for(int j = 0; j <= i - 1; j++) {
                if(expected[j] > expected[j+1]) {
                    temp = expected[j+1];
                    expected[j+1] = expected[j];
                    expected[j] = temp;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(heights[i] != expected[i]) {
                count = count + 1;
            }
        }
        return count;
    }
}