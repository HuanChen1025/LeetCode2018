class Solution {
    public boolean isPalindrome(String s) {
        //校验输入
        if (s == null )
            return false;

        //将大写字母全部转为小写字母
        s = s.toLowerCase();

        int pHead = 0;
        int pEnd = s.length()-1;

        while (pHead < pEnd){
            if (validation(s.charAt(pHead))&&validation(s.charAt(pEnd))){
                //同时判断，避免采用for循环，节省时间
                if (s.charAt(pHead) == s.charAt(pEnd)){
                    pHead++;
                    pEnd--;
                }else {
                    return false;
                }
            }
            else if (!validation(s.charAt(pHead))){
                pHead++;
            }
            else if (!validation(s.charAt(pEnd))){
                pEnd--;
            }
        }
        return true;
    }
    
        private boolean validation(char str){
       // if (((s.charAt(pHead) >= 'a' && s.charAt(pHead) <= 'z') || (s.charAt(pHead) >= '0' && s.charAt(pHead) <= '9')))

        if ((str>='a' && str<='z') || (str>='0' && str<='9')){
            return true;

        }
        return false;
    }
}