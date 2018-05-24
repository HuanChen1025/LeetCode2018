class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
                List<Integer> res = new ArrayList<>();
        if (matrix == null || matrix.length == 0)
            return res;

        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int colBegin = 0;
        int colEnd = matrix[0].length-1;

        while (rowBegin <= rowEnd && colBegin <= colEnd){

            //打印上方行
            for (int i=rowBegin;i<=colEnd;i++){
                res.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            //打印右边行
            for (int i=rowBegin;i<=rowEnd;i++){
                res.add(matrix[i][colEnd]);
            }
            colEnd--;

            //打印下方行
            if (rowBegin <= rowEnd){
                for (int i=colEnd;i>=colBegin;i--){
                    res.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            //打印左边列
            if (colBegin <= colEnd){
                for (int i=rowEnd;i>=rowBegin;i--){
                    res.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return res;

    }
}