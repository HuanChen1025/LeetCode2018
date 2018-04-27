class Solution {
    public int findMin(int[] nums) {
               if (nums == null || nums.length == 0)
            return 0;

        int start =0;
        int end = nums.length-1;
        //��һ����С�����һ������˵������ȫ����
        if (nums[start]<nums[end])
            return nums[start];

        int middle=0;
        while (start<=end){
             middle = start +(end-start)/2; //��Ҫ��֤���� int ��ӳ������

            //����λ�����ұߵ����ֱȽ�
            if (nums[middle]>nums[end]){
                start = middle+1;
            }
            //��� end = middle-1 �Ļ�������ͨ�� {3,1,2}
            else if (nums[middle]<nums[end]){
                end = middle;//��Ϊ����� end ���ܾ�����Сֵ�����ܼ�һ
            }
            //����м�������ȡ���ô���ң���Ҫǰ���ƶ�����ȷ��
            //�޷�ȷ����ʱ���� �ұߵ�ֵ�Լ��ͺ���
            else {
                end--;
            }
        }
            return nums[start]; 
    }
}