class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
          if (nums1 == null || nums2 == null )
            return  null;
        if (nums1.length == 0 || nums2.length ==0)
            return nums1.length == 0 ? nums1:nums2;
        //对这两个数组排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> resultList = new ArrayList<>();
        
        //循环遍历两个数组
        for (int i=0,j=0;i<nums1.length&&j<nums2.length;){
            if (nums1[i]>nums2[j]){
                j++;
            }
            else if (nums1[i]<nums2[j]){
                i++;
            }
            else {
                resultList.add(nums1[i]);
                i++;
                j++;
            }
        }
        int [] resultArray = new int[resultList.size()];
      for (int i=0;i<resultList.size();i++){
          resultArray[i]=resultList.get(i);
      }
        return resultArray;
    }
}