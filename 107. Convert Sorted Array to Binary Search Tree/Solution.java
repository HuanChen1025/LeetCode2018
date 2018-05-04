/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
         return arrayToBST(nums,0,nums.length-1);
    }
        private static TreeNode arrayToBST(int nums[],int s,int e){
        if (s>e) return null;
        int mid =s+(e-s)/2;
        TreeNode node = new TreeNode(nums[mid]);

        node.left = arrayToBST(nums,s,mid-1);
        node.right = arrayToBST(nums,mid+1,e);

        return node;
    }
}