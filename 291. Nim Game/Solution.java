class Solution {
    public boolean canWinNim(int n) {
                //��������һ��1-3��ʱ��ʣ�µ��� 4 �ı������Է�������ô�ã��������
        if ((n-1)%4==0 || (n-2)%4==0 || (n-3)%4==0)
            return true;
        else
            return false;
    }
}