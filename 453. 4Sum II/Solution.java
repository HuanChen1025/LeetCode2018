class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
             if (A.length == 0)
            return 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (int a :
                A) {
            for (int b :
                    B) {/**��������ˣ����һ��1�����ߣ���Ϊ1*/
                map.put(a + b, map.getOrDefault(a + b, 0) + 1);
            }
        }

        int res =0;
        for (int c :
                C) {
            for (int d:D
                 ) {
                int part1 = c+d;
                int part2 = -part1;/**�� map ��ȥ�����෴�������û�У�Ϊ0����*/
                res += map.getOrDefault(part2,0);
            }
        }


        return res;
    }
}