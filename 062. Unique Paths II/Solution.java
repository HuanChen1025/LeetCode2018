class Solution{
	
	 public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        //校验输入，如果左上角和右下角为 1 的话，直接返回 false
        if(obstacleGrid.length == 0 || obstacleGrid[0].length == 0 || obstacleGrid[0][0] ==1 || obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] == 1)
            return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int [][] res = new int [m][n];
        //第一行行置为1
        for (int i=0;i<m;i++){
            if (obstacleGrid[i][0] == 0)
                res[i][0] = 1;
            else {//如果第一行有一个为0，之后的全部为0
                break;
            }
        }
        //第一列置为1
        for (int i=0;i<n;i++){
            if (obstacleGrid[0][i] == 0)
                res[0][i] =1;
            else {
                //如果第一列有0，那么其后全部为0，因为只能往下和往右走
                break;
            }
        }
        //中间遍历
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                if (obstacleGrid[i][j] == 0){
                    res[i][j] = res[i-1][j] + res[i][j-1];
                }
                else {
                    res[i][j] = 0;
                }
            }//for
        }//for
        return res[m-1][n-1];
    }
}