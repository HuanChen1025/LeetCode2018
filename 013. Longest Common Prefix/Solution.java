class Solution {
    public String longestCommonPrefix(String[] strs) {
  if (strs.length ==0 || strs == null)
            return "";
        
        //�ҵ�����ַ���
        int shortLength = strs[0].length();
        for (String str :
                strs) {
            if (shortLength>str.length())
                shortLength = str.length();
        }
        int i;
        // �����жϣ���������ַ������Ƚ��б���
        for(i=0; i<shortLength; i++){
            //����һ����־λ
            boolean flag = true;
            for(int j=0; j<strs.length;j++){

                if(strs[0].charAt(i)!=strs[j].charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
        }

        String string = strs[0].substring(0, i);
        return string;
    }
}