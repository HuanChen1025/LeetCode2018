class Solution {
    public boolean repeatedSubstringPattern(String s) {
                //У������
        if (s.length() <= 1 || s == null)
            return false;
        int len = s.length();
        for(int i=1;i<=len/2;i++) {//��󳤶�
            if(len%i == 0) {
                String tem = s.substring(0, i);//�Ӵ�
                StringBuffer sb = new StringBuffer();
                for(int j=0;j<len/i;j++) {
                    sb = sb.append(tem);//������ͬ����
                }
                if(sb.toString().equals(s))//��֤
                    return true;
            }
        }
        return false;
    }
}