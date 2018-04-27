class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
               List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0 )
            return res;
        Map<Integer,Integer> map = new HashMap<>();

        //遍历元素，添加到 hashmap，语句非常精简
        for (int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        //优先队列，实现最大堆，这里看不懂？？？？
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a,b) -> (b.getValue() - a.getValue()));

        //map.entrySet() 返回此映射所包含的映射关系的 Set 视图。
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