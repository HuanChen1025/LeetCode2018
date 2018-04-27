class Solution {
    public List<String> letterCombinations(String digits) {
         //校验输入
        if (digits == null || digits.length() == 0)
            return new ArrayList<>();

        int length = digits.length();

        //如果数字不在 2—9 这个范围内，返回为空
        for (int i=0;i<length;i++){
            if (digits.charAt(i)<='1' || digits.charAt(i)>'9')
                return new ArrayList<>();
        }

        HashMap<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        //此处这个队列采用 LinkedList 是最优的
        LinkedList<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();
        queue.add("");

        for (int i=0;i<length;i++){

            int size = queue.size();

            //获取数字对应的字母
            String str = map.get(digits.charAt(i));

            //这里采用的是获取的 queue 的 size，而不是实时的 queue szie ，
            // 所以在循环中queue中元素的添加不会影响到这里条件判断
            for (;size>0;size--){
                String s = queue.pollFirst();//移除队列的头元素
                for (int j=0;j<str.length();j++){
                    String temp =s + str.charAt(j);
                    queue.offer(temp);
                }
            }
        }

        result.addAll(queue);

        return result; 
    }
}