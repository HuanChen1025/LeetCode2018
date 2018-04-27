class Solution {
    public String reverseVowels(String s) {
               //校验输入
        if (s == null || s.length() == 0)
            return s;

        //将字符串转化为数组
        char[] chars = s.toCharArray();

        //创建 hashset,用于判别
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        int start = 0;
        int end =chars.length-1;

        while (start < end){
            //如果前后相等，交换
            if (set.contains(chars[start]) && set.contains(chars[end])){
                char temp = chars[end];
                chars[end] = chars[start];
                chars[start] = temp;
                start++;
                end--;
            }
            else {
                if (!set.contains(chars[start])){
                    start++;
                }
                else {
                    end--;
                }
            }
        }

        return String.valueOf(chars); 
    }
}