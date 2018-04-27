class Solution {
    public int[] countBits(int num) {
        int [] res = new int[num+1];
              if (num<=0)
            return res;

        

        int base =1;

        /**
         * 0,1 的基础上加上1 就是2,3
         * 0,1,2,3 的基础上加上1 就是 4-7；
         * 2 的指数次方为分界点
         */
        while (base<=num){

            int next = base<<1; //下一个末尾全为0的值

            for (int i=base;i<next && i<=num;i++){
                res[i] = res[i-base]+1;
            }

            base = next;
        }

        return res;  
    }
}