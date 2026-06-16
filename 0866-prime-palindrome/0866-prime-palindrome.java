class Solution {
    public int primePalindrome(int n) {
        if(n >= 8 && n <= 11) {
            return 11;
        }

        for(int x = 1; x < 100000; x++) {

            int palindrome = getPalindrome(x);
            if(palindrome >= n && isPrime(palindrome)) {
                return palindrome;
            }
        }
        return -1;
    }

    public boolean isPrime(int number) {
        if(number >= 2) {
            int i=2;
            while(i*i<=number) {
                if(number%i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
        return false;
    }
    public int getPalindrome(int x) {
        int result = x;
        x /= 10;
        while(x > 0) {
            result = result * 10 + (x%10);
            x /= 10;
        }
        return result;
    }
}