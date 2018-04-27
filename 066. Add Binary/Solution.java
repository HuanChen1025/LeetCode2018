class Solution {
    public String addBinary(String a, String b) {
               //У������
        if (a == null || b == null)
            return "0";

        int aLen = a.length()-1;
        char[] a2char = a.toCharArray();
        reverse(a2char);

        int bLen = b.length()-1;
        char[] b2char = b.toCharArray();
        reverse(b2char);


        //add ��ʾ��λ
        int add =0;

        //����
        StringBuffer res = new StringBuffer();
        int i =0,j=0;
        for (;i<=aLen||j<=bLen;i++,j++){
            int aValue;
            int bValue;

            if (i>aLen){
                aValue = 0;
            }
            else {
                aValue = a2char[i]-'0';
            }
            if (j>bLen){
                bValue =0;
            }
            else {
                bValue = b2char[j]-'0';
            }
            int temp = aValue + bValue + add;
            res.append(temp%2);
            add = temp/2;
        }


        if (add!=0){
            res.append(add);
        }

        return res.reverse().toString(); 
    }
        private void reverse(char[] chars){
        int start = 0;
        int end = chars.length-1;
        while (start<end){
            char temp = chars[end];
            chars[end] =chars[start];
            chars[start] =temp;
            start++;
            end--;
        }

    }
}