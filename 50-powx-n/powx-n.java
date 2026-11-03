class Solution {
    public double myPow(double x, int n) {
        double ans = 0;
        if (x != 0) {
            ans = Math.pow(x,n);
        }
        else if (x == 0) {
            return 0;
        }
        return ans;
    }
}