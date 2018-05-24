class Solution {
    public void setZeroes(int[][] matrix) {
                if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return;

        int rowNum = matrix.length;
        int colNum = matrix[0].length;

        int [] rows = new int[rowNum];

        for (int i=0;i<rows.length;i++)
            rows[i] =1;

        int [] cols = new int[colNum];

        for (int i=0;i<cols.length;i++)
            cols[i] =1;

        for (int i=0;i<rowNum;i++){
            for (int j=0;j<colNum;j++){
                if (matrix[i][j] == 0){
                    rows[i] =0;
                    cols[j] =0;
                   // break;
                }
            }
        }

       for (int i=0;i<rows.length;i++){
            if (rows[i] == 0){
               for (int j=0;j<colNum;j++){
                   matrix[i][j] =0;
               }
            }
       }

       for (int i=0;i<cols.length;i++){
            if (cols[i] == 0){
                for (int j=0;j<rowNum;j++){
                    matrix[j][i] = 0;
                }
            }
       }
    }
}