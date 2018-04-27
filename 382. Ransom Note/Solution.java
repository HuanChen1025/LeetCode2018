class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
          //自建哈希表
        int[] map = new int[26];   //存储 magazine 字符出现频次

        for (char c:magazine.toCharArray()
             ) {
            map[c-'a'] +=1;
        }

        for (char c:ransomNote.toCharArray()
             ) {
            map[c-'a'] -=1;
            //如果小于 0，两种情况：1）小于magazine该字符的数量，2)在magazine没有这个字符
            if (map[c-'a']<0)
                return false;
        }
        return true; 
    }
}