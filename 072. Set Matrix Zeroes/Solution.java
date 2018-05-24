class Solution{
	 public static void setZeroes_01(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return;

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] res = new int[row][col];

        //返回数组赋初值
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                res[i][j] =matrix[i][j];
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if (matrix[i][j] == 0){
                    for (int k =0;k<row;k++)
                        res[k][j] =0;
                    for (int k=0;k<col;k++)
                        res[i][k] =0;
                }
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matrix[i][j] = res[i][j];
            }
        }
    }
}