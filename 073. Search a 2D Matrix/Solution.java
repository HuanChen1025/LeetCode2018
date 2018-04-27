class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;

        int row = matrix.length-1;    //ÐÐ
        int col = matrix[0].length-1; //ÁÐ

        for (int i=0,j=col;i<=row && j>=0;){
            if (matrix[i][j]>target){
                j--;
            }
            else if (matrix[i][j]<target){
                i++;
            }
            else {
                return true;
            }
        }

        return false;
    }
}