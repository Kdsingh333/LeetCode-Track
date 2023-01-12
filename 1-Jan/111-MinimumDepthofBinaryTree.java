/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        return Depth(root);
    }
    public int Depth(TreeNode root){
        if(root == null ){
            return 0;
        }
       
        int leftNode = Depth(root.left);
        int rightNode = Depth(root.right);

     return (leftNode == 0 || rightNode == 0) ? leftNode+rightNode+1:Math.min(leftNode,rightNode)+1;
    }
}