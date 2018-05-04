class Solution {
    public boolean isPalindrome(int x) {
        if (x<0)
            return false;
        char [] chars = String.valueOf(x).toCharArray();
        int start = 0;
        int end = chars.length-1;
        while (start<end){
            if (chars[start] != chars[end]){
                return false;
            }
            else {
                start++;
                end--;
            }
        }

        return true;
    }
}