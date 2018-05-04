class Solution {
    public boolean isPalindrome(int x) {
         if (x<0 || (x!=0 && x%10 ==0)) return false; 
        int temp=x;long res=0;

        while (temp!=0){
            res = res*10 + temp%10;
            temp /= 10;
        }
        return x == (int)res;
    }
}