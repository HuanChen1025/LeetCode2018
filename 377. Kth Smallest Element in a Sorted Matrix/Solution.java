class Solution {
    public int kthSmallest(int[][] matrix, int k) {
                PriorityQueue<Integer> minHeap = new PriorityQueue<>(k+1,(a,b)->(a-b));

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                minHeap.offer(matrix[i][j]);
            }
        }

        for (int i=1;i<k;i++){
            minHeap.poll();
        }

        return minHeap.poll();
    }
}