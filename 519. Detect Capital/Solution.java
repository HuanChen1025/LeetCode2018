class Solution {
    public boolean detectCapitalUse(String word) {
                if (word == null)
            return false;
        if (word.length() == 0)
            return true;

        int len = word.length();

        int a_num =0;
        int A_num =0;

        //����ĸСд
        if (word.charAt(0)>='a' && word.charAt(0) <='z'){
            for (int i=1;i<len;i++){
                if (word.charAt(i)>='A' && word.charAt(i)<='Z'){
                    return false;
                }
                else {
                    a_num++;
                }
            }
            if (a_num == len-1)
                return true;
        }
        //����ĸ��д
        else {
            for (int i=1;i<len;i++){
                if (word.charAt(i)>='a' && word.charAt(i) <='z'){
                    a_num++;
                }
                else  {
                    A_num++;
                }
            }
               if (A_num == len-1 || a_num == len-1)
                   return true;
        }

        return false;
    }
}