class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
               List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0 )
            return res;
        Map<Integer,Integer> map = new HashMap<>();

        //����Ԫ�أ���ӵ� hashmap�����ǳ�����
        for (int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        //���ȶ��У�ʵ�����ѣ����￴������������
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a,b) -> (b.getValue() - a.getValue()));

        //map.entrySet() ���ش�ӳ����������ӳ���ϵ�� Set ��ͼ��
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            maxHeap.add(entry);
        }

        while(res.size()<k){
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            res.add(entry.getKey());
        }
        return res;
    }
}