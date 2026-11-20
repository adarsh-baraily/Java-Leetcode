class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> viewed = new HashSet<>();
        while(n != 1) {
            if(!viewed.contains(n)) {
                viewed.add(n);
            } else {
                return false;
            }
            n = getnumber(n);
        }
        return true;
    }
    private int getnumber(int num) {
        int sum = 0;
        while(num != 0) {
            int dg = num % 10;
            sum = sum + (dg * dg);
            num = num / 10;
        }
        return sum;
    }
}