class Solution {
    public boolean isAnagram(String s, String t) {
               if (s == null || t == null)
            return false;

        //ʹ��һ������Ϊ 256 �Ĺ�ϣ��
        int [] firstStrMap  = new int[256];
        int [] secondStrMap = new int[256];

        for (int i=0;i<s.length();i++)
            firstStrMap[s.charAt(i)] +=1;

        for (int i=0;i<t.length();i++){
            secondStrMap[t.charAt(i)] +=1;
        }

        for (int i=0;i<firstStrMap.length;i++){
            if (firstStrMap[i]!=secondStrMap[i])
                return false;
        }
        return true;
    }
}