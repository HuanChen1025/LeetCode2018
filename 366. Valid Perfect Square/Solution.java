class Solution {
    public boolean isPerfectSquare(int num) {
                if (num<0)
            return false;

        int start = 0;
        int end = num;

        int middle = (start+end)/2;

        while (start<=end){
            if (Math.pow(middle,2)>num){
                end = middle-1;
            }
            else  if (Math.pow(middle,2)<num){
                start =middle+1;
            }
           else {
                return true;
            }
            middle = (start+end)/2;
        }
        return false;
    }
}