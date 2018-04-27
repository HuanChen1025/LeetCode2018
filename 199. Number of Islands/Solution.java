class Solution {
    public int numIslands(char[][] grid) {
                //У������
        if (grid == null || grid.length==0 || grid[0].length ==0)
            return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        int result = 0;
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (grid[i][j]=='1')
                    result++;
                    dfSearch(grid,i,j,rows,cols);
            }
        }
        return result;
    }
    
     //���һ��λ��Ϊ 1 ���������ܵ� 1 ȫ����Ϊ 0
    private void dfSearch(char[][] grid,int i,int j,int rows,int cols){
        if (i<0 || i>=rows || j<0 || j>=cols)
            return;
        //������λ�ò�Ϊ 1 ������
        if (grid[i][j] != '1')
            return;

        grid[i][j] = 0;
        //�� i j λ�õ�������������һ�飬���Ϊ 1 ����λ 0
        dfSearch(grid,i-1,j,rows,cols);
        dfSearch(grid,i+1,j,rows,cols);
        dfSearch(grid,i,j-1,rows,cols);
        dfSearch(grid,i,j+1,rows,cols);
    }
}