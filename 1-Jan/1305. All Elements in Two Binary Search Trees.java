class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> q = new ArrayList<>();
        insert(root1,q);
        insert(root2,q);

        Collections.sort(q);
        return q;
    }

    public List<Integer> insert(TreeNode root , List<Integer> q){
        if(root == null){
            return q;
        }
        insert(root.left,q);
        q.add(root.val);
        insert(root.right,q);

        return q;
    }
}