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
    public TreeNode bstFromPreorder(int[] preorder) {
       TreeNode root = null;

        for(int i =0; i<preorder.length; i++){
            root = insert(root,preorder[i]);
        }
     

      return root;

    }

    static TreeNode insert(TreeNode root,int data){
       
        if(root == null){
            root = new TreeNode(data);
        }
        else if(root.val>data){
            root.left= insert(root.left,data);
        }
        else{
            root.right = insert(root.right,data);
        }
        return root;
    }
}