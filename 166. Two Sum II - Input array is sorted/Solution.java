class Solution {
    public int[] twoSum(int[] numbers, int target) {
                int[] res = new int[2];
        //Ğ£ÑéÊäÈë
        if (numbers.length == 0 || numbers == null)
            return res;

        int start = 0;

        int end = numbers.length-1;

        while (start < end){
            int sum = numbers[start] + numbers[end];
            if (sum >target){
                end--;
            }
            else if (sum<target){
                start++;
            }
            else{
                res[0] = start+1;
                res[1] = end+1;
                break;
            }
        }
        return res;
    }
}