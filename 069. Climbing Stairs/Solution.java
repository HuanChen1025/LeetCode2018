class Solution {
    public int climbStairs(int n) {
                int first = 1;
        int second =2;
        if (n<=0)
            return 0;
        if (n == 1)
            return first;
        if (n==2)
            return second;
        
        while (n>2){
         int temp = second;
         second +=first;
         first = temp;
          n--;
        }

        return second;
    }
}