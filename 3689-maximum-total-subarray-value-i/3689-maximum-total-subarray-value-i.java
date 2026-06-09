class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
        for(long num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return (max-min)*k;
    }
}