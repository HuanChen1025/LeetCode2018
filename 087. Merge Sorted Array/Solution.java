class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
             int index= m+n-1;
        int nums1Length = m-1;
        int nums2Length = n-1;

        while (index>=0){
            //��һ�����������ڶ�������δ���������и�С��Ԫ��
            if (nums1Length<0){
                for (int i= nums2Length;i>=0;i--){
                    nums1[index--] = nums2[nums2Length--];
                }
                return;
            }

            //�ڶ��������������
            if (nums2Length<0){
                return;
            }

            if (nums1[nums1Length]>nums2[nums2Length]){
                nums1[index--] = nums1[nums1Length--];
            }
            else {
                nums1[index--] = nums2[nums2Length--];
            }
        }
    }
}