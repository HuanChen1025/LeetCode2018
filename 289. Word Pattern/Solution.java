class Solution{
	    public static boolean wordPattern(String pattern, String str) {
        if (pattern == null || str == null)
            return false;
        String [] words = str.split(" ");
        if (pattern.length() != words.length)
            return false;

        Map map = new HashMap();

        //此处的循环处必须要时Integer 才可以通过全部测试用例
        //因为在 map 中存储的是Integer ，此处并没有自动装箱，只能使用对象类型
        for (Integer i=0;i<words.length;i++){
            if (map.put(pattern.charAt(i),i)!= map.put(words[i],i))
                return false;
        }
        return true;
    }
}