class Solution {
    public boolean isHappy(int n) {
                //如果有 n 为1，说明找到快乐数，循环结束，如果 n 为 4 ，说明不存在快乐数，
        while (n!=1 && n!=4){
            int sum =0;
            while (n!=0){
                int index = n%10;
                sum +=Math.pow(index,2);
                n = n/10;
            }
            n = sum;
        }

        return n == 1;
    }
}