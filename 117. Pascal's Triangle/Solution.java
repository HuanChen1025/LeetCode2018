class Solution {
    public List<List<Integer>> generate(int numRows) {
             List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp;
        //У������
        if (numRows<=0){
            return result;
        }

        for (int i=1;i<=numRows;i++){
            temp = new ArrayList<>();
            if (i==1){
                temp.add(1);
                result.add(temp);
            }
            if (i==2){
                temp.add(1);
                temp.add(1);
                result.add(temp);
            }
            if (i>2){
                temp.add(1);
                //�м�����Ҫ�����ֵ
                List<Integer> list = result.get(i-2);
                for (int j=0;j<list.size()-1;j++){
                    int sum = list.get(j) + list.get(j+1);
                    temp.add(sum);
                }
                temp.add(1);
                result.add(temp);
            }

        }
        return result;
    }
}