class Solution {
    public String longestCommonPrefix(String[] strs) {
  if (strs.length ==0 || strs == null)
            return "";
        
        //找到最短字符串
        int shortLength = strs[0].length();
        for (String str :
                strs) {
            if (shortLength>str.length())
                shortLength = str.length();
        }
        int i;
        // 遍历判断，依据最短字符串长度进行遍历
        for(i=0; i<shortLength; i++){
            //设置一个标志位
            boolean flag = true;
            for(int j=0; j<strs.length;j++){

                if(strs[0].charAt(i)!=strs[j].charAt(i)){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
        }

        String string = strs[0].substring(0, i);
        return string;
    }
}