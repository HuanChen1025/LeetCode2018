class Solution {
    public int removeDuplicates(int[] nums) {
                if (nums.length == 0 || nums == null)
            return 0;
        //�ж�������
        int number = 0;//��Ǽ���
        for (int i=0; i < nums.length ; i++) {
            if ( nums[i] != nums[number] ) {
                number++;
                nums[number] = nums[i];
            }
        }
        number+=1; //���+1��Ϊ���ָ���
        return number;
    }
}