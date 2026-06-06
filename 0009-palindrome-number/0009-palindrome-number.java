class Solution {
    public boolean isPalindrome(int x) {
        String strNum = String.valueOf(x);
        
        int i = 0, j = strNum.length()-1;
        while(i!=j) {
            if(strNum.charAt(i) != strNum.charAt(j))
                return false;
            if(i+1!=j) {
                i++; j--;
            } else {
                i++;
            }
        }
        return true;
    }
}