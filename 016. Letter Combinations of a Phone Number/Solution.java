class Solution {
    public List<String> letterCombinations(String digits) {
         //У������
        if (digits == null || digits.length() == 0)
            return new ArrayList<>();

        int length = digits.length();

        //������ֲ��� 2��9 �����Χ�ڣ�����Ϊ��
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

        //�˴�������в��� LinkedList �����ŵ�
        LinkedList<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();
        queue.add("");

        for (int i=0;i<length;i++){

            int size = queue.size();

            //��ȡ���ֶ�Ӧ����ĸ
            String str = map.get(digits.charAt(i));

            //������õ��ǻ�ȡ�� queue �� size��������ʵʱ�� queue szie ��
            // ������ѭ����queue��Ԫ�ص���Ӳ���Ӱ�쵽���������ж�
            for (;size>0;size--){
                String s = queue.pollFirst();//�Ƴ����е�ͷԪ��
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