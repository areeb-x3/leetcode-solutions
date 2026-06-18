class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] newArr = new int[nums.length];
        int positiveIndex = 0;
        int negativeIndex = 1;

        for(int num : nums) {
            if(num > 0) {
                newArr[positiveIndex] = num;
                positiveIndex += 2;
            } else if(num < 0) {
                newArr[negativeIndex] = num;
                negativeIndex += 2;
            }
        }
        return newArr;
    }
}