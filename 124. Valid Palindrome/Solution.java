class Solution {
    public boolean isPalindrome(String s) {
        //У������
        if (s == null )
            return false;

        //����д��ĸȫ��תΪСд��ĸ
        s = s.toLowerCase();

        int pHead = 0;
        int pEnd = s.length()-1;

        while (pHead < pEnd){
            if (validation(s.charAt(pHead))&&validation(s.charAt(pEnd))){
                //ͬʱ�жϣ��������forѭ������ʡʱ��
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