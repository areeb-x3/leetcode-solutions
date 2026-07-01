class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, major = -1;
        for(int num : nums) {
            if(count == 0) { major = num; }
            
            if(major == num) {
                count++;
            } else {
                count--;
            }
        }
        return major;
    }
}