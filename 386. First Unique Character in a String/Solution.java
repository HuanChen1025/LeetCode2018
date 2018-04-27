class Solution {
    public int firstUniqChar(String s) {
                if (s == null)
            return -1;

        //ʹ��һ������Ϊ 256 �Ĺ�ϣ��
        int [] hashMap = new int[256];

        //��ʼ��
        for (int i=0;i<hashMap.length;i++){
            hashMap[i] =0;
        }

        //���ַ��ĳ��ִ����洢����ϣ����
        for (int i=0;i<s.length();i++){
            hashMap[s.charAt(i)] +=1;
        }

        for (int i=0;i<s.length();i++){
            if (hashMap[s.charAt(i)]== 1)
                return i;
        }
        return -1;
    }
}