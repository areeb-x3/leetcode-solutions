class Solution {
    public int findSum(int x) {
        int sum = 0;
        while(x != 0) {
            sum += x%10;
            x/=10;
        }
        return sum;
    }
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        if(x % findSum(x) == 0) {
            return findSum(x);
        }
        return -1;
    }
}