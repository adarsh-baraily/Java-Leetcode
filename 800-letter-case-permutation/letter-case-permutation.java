class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> res = new ArrayList<>();
        helper(0, s.toCharArray(), res);
        return res;
    }
    private void helper(int i, char arr[], List<String> res) {
        if(i == arr.length) {
            res.add(new String(arr));
            return;
        }
        char ch = arr[i];
        if(Character.isDigit(ch)) {
            helper(i + 1, arr, res);
        }
        else {
            arr[i] = Character.toUpperCase(ch);
            helper(i + 1, arr, res);

            arr[i] = Character.toLowerCase(ch);
            helper(i + 1, arr, res);
        }
    }
}