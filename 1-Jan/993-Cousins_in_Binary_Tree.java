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
    class Pair{
         TreeNode parent;
          int level;
          Pair(TreeNode parent, int level){
              this.parent = parent;
              this.level = level;

          }

    }
    public boolean isCousins(TreeNode root, int x, int y) {
        Pair pair1 = data(root,x,null,0);
        Pair pair2 = data(root,y,null,0);
        if(pair1.level == pair2.level && pair2.parent != pair1.parent){
            return true;
        }
        return false;
    }

    Pair data(TreeNode root, int x , TreeNode  parent, int level){
        if(root == null){
            return null;
        }
        if(root.val == x){
            return  new Pair(parent,level);
        }

        Pair left = data(root.left,x,root,level+1);
        Pair  right= data(root.right,x,root,level+1);

        return left == null ? right : left;
    }
}