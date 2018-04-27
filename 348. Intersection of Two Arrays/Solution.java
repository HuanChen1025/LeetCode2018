class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
                int[] result = {};
        HashSet<Integer> res = new HashSet<>();
        if (nums1.length == 0 || nums1 == null || nums2.length == 0 || nums2 == null)
            return result;

        HashSet<Integer> set = new HashSet<>();

        for (int value :
                nums1) {
            set.add(value);
        }

        for (int value :
                nums2) {
            if (set.contains(value))
                res.add(value);
        }

        result = new int[res.size()];

        int i=0;


        for (int value:
             res) {
            result[i] = value;
            i++;
        }

        return result;
    }
}