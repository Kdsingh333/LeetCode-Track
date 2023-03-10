/**
Given the root of a binary tree, return the preorder traversal of its nodes' values.
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> q = new ArrayList<>();
        
         return preorder(root , q);
    }

    public List<Integer> preorder(TreeNode root , List<Integer> q){
        if(root == null){
            return q ;
        }
        q.add(root.val);
        preorder(root.left,q);
        preorder(root.right,q);

        return q;
    }
}