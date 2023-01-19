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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        else if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        else return root;
    }
}

/*
 *  for this question we using the property of BST
 *  first we check the value of p and q node is this value bigger that root value if yes 
 * then must be ansewer LCA will be present in the right side else it will on the left 
 * side of the tree ,
 * if both condition not matching each other  than must value liy on the opposite to each 
 * other sub tree which  means first root value is the LCA .
 *  
 */