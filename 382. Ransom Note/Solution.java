class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
          //�Խ���ϣ��
        int[] map = new int[26];   //�洢 magazine �ַ�����Ƶ��

        for (char c:magazine.toCharArray()
             ) {
            map[c-'a'] +=1;
        }

        for (char c:ransomNote.toCharArray()
             ) {
            map[c-'a'] -=1;
            //���С�� 0�����������1��С��magazine���ַ���������2)��magazineû������ַ�
            if (map[c-'a']<0)
                return false;
        }
        return true; 
    }
}