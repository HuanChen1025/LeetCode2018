class Solution {
    public int hIndex(int[] citations) {
             if (citations.length == 0 || citations == null)
            return 0;

        int len = citations.length;
        int res =0; //·µ»Ø³¤¶È
        int start = 0;
        int end = len-1;

        while (start<=end){
            int middle = start +(end-start)/2;

            if (citations[middle]>=len-middle){
                res = Math.max(res,len-middle);
                end = middle-1;
            }
            else {
                start = middle+1;
            }
        }
        
        return res;  
    }
}