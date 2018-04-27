class Solution {
    public int hammingDistance(int x, int y) {
                int result = 0;
        for (int i=0;i<31;i++){
            int currentX = x&1;
            int currentY = y&1;
            x=x>>1;
            y=y>>1;
            if (currentX != currentY)
                result++;
        }
        return result;
    }
}