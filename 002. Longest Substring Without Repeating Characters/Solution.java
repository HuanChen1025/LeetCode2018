class Solution {
    public int lengthOfLongestSubstring(String s) {
                if (s == null || s.length()==0)
            return 0;

        int[] map = new int[256];

        int resultLength = 0;
        int currentLength = 0;

        for (int i=0;i<s.length();){
            //��������ظ�Ԫ��
            if (map[s.charAt(i)]>=1){
               // String str =s.substring(0,i+1);//��Ҫ������ַ���
                i= map[s.charAt(i)]; //���� i ��λ��
                //cleanArrays(map,str);
                map = new int[256];
                currentLength=0;
                continue;
            }

            currentLength++;
            map[s.charAt(i)]=i+1;
            resultLength = Math.max(resultLength,currentLength);
            i++;

        }

        return resultLength;
    }
}