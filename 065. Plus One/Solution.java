class Solution {
    public int[] plusOne(int[] digits) {
                if (digits == null || digits.length ==0)
            return null;

        //�Ӻ���ǰ����
        int carry =1;   //�����жϸõ�ǰλ��һ�Ƿ��н�λ
        for (int i=digits.length-1;i>=0;i--){
            //��� carry == 0,˵����һ֮��Ϊ��Ϊ����λ�����ӣ�ֱ�ӷ���
            if (carry ==0){
                return digits;
            }
            int temp = digits[i]+1;
            carry = temp/10;    //�жϼ�һ���Ƿ�����˽�λ
            digits[i] = temp%10;    //��������˽�λ��Ϊ 0�����û�в�����λ����Ϊ��һ�������
        }

        if (carry == 1){
            int[] result = new int[digits.length+1];
            //��ʼ��Ϊ 0
            for (int i=0;i<result.length;i++){
                result[i]=0;
            }
            result[0] =1;
            return result;
        }
        return digits;
    }
}