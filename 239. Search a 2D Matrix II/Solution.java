class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
                //У������
        if (matrix== null || matrix.length ==0 || matrix[0].length==0)
            return false;

        int rows = matrix.length;//��
        int cols = matrix[0].length;    //��

        int i=0,j=cols-1;

        for ( ;i<rows&&j>=0;){
                if (matrix[i][j]>target){
                    j--;
                }
                else if (matrix[i][j]<target){
                    i++;
                }
                else if (matrix[i][j]==target){
                    return true;
                }

        }
        return false;
    }
}