class Solution {
    public boolean isHappy(int n) {
                //����� n Ϊ1��˵���ҵ���������ѭ����������� n Ϊ 4 ��˵�������ڿ�������
        while (n!=1 && n!=4){
            int sum =0;
            while (n!=0){
                int index = n%10;
                sum +=Math.pow(index,2);
                n = n/10;
            }
            n = sum;
        }

        return n == 1;
    }
}