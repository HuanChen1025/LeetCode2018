class Solution {
    public int firstUniqChar(String s) {
                if (s == null)
            return -1;

        //使用一个长度为 256 的哈希表
        int [] hashMap = new int[256];

        //初始化
        for (int i=0;i<hashMap.length;i++){
            hashMap[i] =0;
        }

        //将字符的出现次数存储到哈希表中
        for (int i=0;i<s.length();i++){
            hashMap[s.charAt(i)] +=1;
        }

        for (int i=0;i<s.length();i++){
            if (hashMap[s.charAt(i)]== 1)
                return i;
        }
        return -1;
    }
}