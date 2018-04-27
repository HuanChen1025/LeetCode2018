class Solution {
    public String reverseString(String s) {
               if (s == null)
            return null;
        int pHead = 0;
        int pEnd = s.length()-1;
        char[] str = s.toCharArray();

        while (pHead<pEnd){
            char temp = str[pHead];
            str[pHead] = str[pEnd];
            str[pEnd] = temp;
            pHead++;
            pEnd--;
        }
        return String.valueOf(str);
    }
}