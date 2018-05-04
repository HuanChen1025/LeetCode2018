class Solution {
    private int lo,maxlen; 
	/**
     * 求取最长的回文字符串
     * https://leetcode.com/problems/longest-palindromic-substring/discuss/2928/Very-simple-clean-java-solution?page=3
     *
     * 该算法时间复杂度大于O（N*logN），在循环一遍的基础上，每个位置都要向外扩散查找。
     *
     * the most worse case is a string repeating same character "aaaaaaaa",为O（N^2)
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        int len =s.length();
        if (len<2){
            return s;
        }

        for (int i=0;i<len-1;i++){
            //assume odd length, examples:"aba"，从中间树开始向两边查找
            extendPalindrome(s,i,i);
            // assume even lenght,examples:"abba".从中间两个数开始向两边查找
            extendPalindrome(s,i,i+1);

        }

        return s.substring(lo,lo+maxlen);  
    }
	/**
     * 此处的时间复杂度为 O（logN）
     * @param s
     * @param j
     * @param k
     */
    private void extendPalindrome(String s,int j,int k){
        while (j>=0 && k<s.length() && s.charAt(j) == s.charAt(k)){
            j--;
            k++;
        }
        //记录最大回文子串的在字符串中的位置
        if (maxlen < k-j-1){
            lo = j+1;
            maxlen =k-j-1;
        }
    }
}