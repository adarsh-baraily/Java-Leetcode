class Solution {
    public int addDigits(int num) {
        if ( num < 10) {
            return num;
        }
        int dg = 0;
        int sum = 0;
        while (num > 0) {
            dg = num % 10;
            sum = sum + dg;
            num = num / 10;
        }
        return addDigits(sum);
    }
}