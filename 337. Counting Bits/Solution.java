class Solution {
    public int[] countBits(int num) {
        int [] res = new int[num+1];
              if (num<=0)
            return res;

        

        int base =1;

        /**
         * 0,1 �Ļ����ϼ���1 ����2,3
         * 0,1,2,3 �Ļ����ϼ���1 ���� 4-7��
         * 2 ��ָ���η�Ϊ�ֽ��
         */
        while (base<=num){

            int next = base<<1; //��һ��ĩβȫΪ0��ֵ

            for (int i=base;i<next && i<=num;i++){
                res[i] = res[i-base]+1;
            }

            base = next;
        }

        return res;  
    }
}