class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr ^= i ^ nums[i];
        }
        return xorr^n;
    }
}
