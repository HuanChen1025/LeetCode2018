class Solution {
    public int lengthOfLastWord(String s) {
                if (s.length() == 0 || s == null)
            return 0;

        String []  str = s.split(" ");

        if (str.length == 0)
            return 0;

        return str[str.length-1].length();
    }
}