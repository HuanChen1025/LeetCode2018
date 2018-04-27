class Solution {
    public int strStr(String haystack, String needle) {
                int m = haystack.length();
        int n = needle.length();
        for (int i=0;i<=m-n;i++){
            int j;
            for (j=0;j<n;j++){
                if (haystack.toCharArray()[i+j] != needle.toCharArray()[j]){
                    break;
                }
            }
            if (j==n)
                return i;
        }
        return -1;
    }
}