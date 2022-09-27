class Solution {
    TreeNode first, second, prev;
    public void recoverTree(TreeNode root) {
        first = second = null;
        prev = new TreeNode(Integer.MIN_VALUE);
        traversal(root);
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }
    
    public void traversal(TreeNode root){
        if(root == null) return;
        traversal(root.left);
        if(first == null && prev.val > root.val){
            first = prev;
        }
        if(first != null && prev.val > root.val){
            second = root;
        }
        prev = root;
        traversal(root.right);
    }
}