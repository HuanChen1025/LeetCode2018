class Solution {
    public void rotate(int[][] matrix) {
                //У������
        if (matrix == null)
            return;

        //N * N �ľ��󳤶�
        int nLength = matrix.length;
        //�ظ��Խ��߷�ת
        for (int i=0;i<nLength;i++)
            for (int j=0;j<nLength-i;j++){
            int temp =  matrix[i][j];
            matrix[i][j] = matrix[nLength-1-j][nLength-1-i];
            matrix[nLength-1-j][nLength-1-i] = temp;
            //swap(matrix[i][j],matrix[nLength-1-j][nLength-1-i]);
            }

            //��ˮƽ�߷�ת
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