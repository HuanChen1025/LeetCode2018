class Solution {
    public int titleToNumber(String s) {
                int len = s.length();

        int sum =0;

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                sum  +=  (s.charAt(i)-'A'+1)*((int)Math.pow(26,len-i-1));
            }
            else {
                return 0;
            }
        }

        return sum;
    }
}