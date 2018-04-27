class Solution {
    public void rotate(int[][] matrix) {
                //校验输入
        if (matrix == null)
            return;

        //N * N 的矩阵长度
        int nLength = matrix.length;
        //沿副对角线翻转
        for (int i=0;i<nLength;i++)
            for (int j=0;j<nLength-i;j++){
            int temp =  matrix[i][j];
            matrix[i][j] = matrix[nLength-1-j][nLength-1-i];
            matrix[nLength-1-j][nLength-1-i] = temp;
            //swap(matrix[i][j],matrix[nLength-1-j][nLength-1-i]);
            }

            //沿水平线翻转
            for (int i=0;i<nLength/2;i++){
            for (int j=0;j<nLength;j++){
                //swap(matrix[i][j], matrix[nLength - 1 - i][j]);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[nLength - 1 - i][j];
                matrix[nLength - 1 - i][j] =temp;
            }
            }
    }
}