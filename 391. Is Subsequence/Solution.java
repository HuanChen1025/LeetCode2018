class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s == null && t == null)
            return true;

        if (t.length() == 0 && s.length() != 0)
            return false;

        if (s.length() == 0 )
            return true;

        int sIndex = s.length();
        int tIndex = t.length();

        for (int i=0,j=0;i<sIndex && j<tIndex;){
            if (s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }
            else {
                j++;
            }

            if (i == sIndex)
                return true;
        }
        return false;
    }
}