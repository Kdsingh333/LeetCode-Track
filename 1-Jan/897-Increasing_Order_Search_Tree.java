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


 // Easy
class Solution {
    public TreeNode increasingBST(TreeNode root) {
    List<Integer> q = new ArrayList<>();
    
         addVal(root,q);
         TreeNode p = new TreeNode(-1);
         TreeNode newRoot = p;
          for(int i:q){
           
            p.right = new TreeNode(i);
            p = p.right;
       }

      return newRoot.right;
    }

    public void addVal(TreeNode root,List<Integer> q){
        if(root == null){
            return ;
        }

         addVal(root.left,q);
         q.add(root.val);
         addVal(root.right,q);
    }


}


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
	public TreeNode increasingBST(TreeNode root) {
		return increasingBST(root, null);
	}
	public TreeNode increasingBST(TreeNode node, TreeNode par) {
		if(node == null) return par;                                    
		TreeNode newRoot = increasingBST(node.left, node);            
		node.left = null;                                              
		node.right = increasingBST(node.right, par);                    
		return newRoot;                                                 
	}
}