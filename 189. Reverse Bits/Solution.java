public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int resultDate = 0;
        for (int i=0;i<=31;i++){
            int index = n&1;
            n=n>>1;
            if (index ==1){
                int temp = 1<<31-i;
                resultDate +=temp;
            }
            index = 0; //�������¸�ֵΪ0
        }
        return resultDate;
    }
}