class Solution {
    public String convert(String s, int numRows) {
          if (numRows <=0)
            return "";
        if (s == null || s.equals(""))
            return s;
          if (numRows == 1 || numRows>=s.length())
            return s;
        StringBuffer sb = new StringBuffer();
        for (int i=0;i<numRows;i++){
            //首行
            if (i==0){
                for (int j=0;j<s.length();){
                    sb.append(s.charAt(j));
                    //下一个索引,如何找出下一个索引位置
                    j = j+ 2*numRows-2;
                }
            }
            //中间行
            if (i>0 && i<numRows-1){
                int start =i;
                sb.append(s.charAt(start));
                for (int j=1;start<s.length();j++){
                    //中间行
                    if (j%2 == 1){
                        //在字符串中位置为奇数时
                        start = start +2 *(numRows-i-1);
                    }
                    else {
                        //偶数
                        start = start +2*i;
                    }
                   if (start<s.length()){
                       sb.append(s.charAt(start));
                   }
                }
            }
            //尾行
            if (i==numRows-1){
                for (int j= numRows-1;j<s.length();){
                    sb.append(s.charAt(j));
                    j = j+2*numRows-2;
                }
            }
        }
        return sb.toString(); 
    }
}