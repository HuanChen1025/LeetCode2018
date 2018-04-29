class Solution {
    public List<Integer> getRow(int rowIndex) {
                List<Integer> result = new ArrayList<>();

        if (rowIndex<0)
            return result;
        
        for (int i=0;i<=rowIndex;i++){
            if (i==0 || i==1){
                result.add(1);
            }
            //建立临时链表，存放下一行的结果
            List<Integer> tem = new ArrayList<>();

            if (i>=2){
                tem.add(1);
                for (int j=0;j<result.size()-1;j++){
                    tem.add(result.get(j)+result.get(j+1));
                }
                tem.add(1);
                //将结果给 result
                result = tem;
            }
        }
        return result;

    }
}