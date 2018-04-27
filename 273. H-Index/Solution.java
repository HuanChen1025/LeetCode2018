class Solution {
    public int hIndex(int[] citations) {
                if (citations.length == 0 || citations == null)
            return 0;

        //¶ÔÊı×éÅÅĞò
        Arrays.sort(citations);

        int len = citations.length;

        int res =0;

        for (int i=0;i<len;i++){
            int temp =0;
            if (citations[i]>=len-i){
                temp = len-i;
                res = Math.max(res,temp);
            }

        }

        return res;
    }
}