class Solution {
    public int[] getConcatenation(int[] nums) {
         int _arrLength = nums.length;
        int[] ans = new int[ _arrLength * 2];

        for (int i = 0; i < _arrLength; i++) {
            ans[i] = nums[i];
            ans[i + _arrLength ] = nums[i];
        }

        return ans;
    }
}