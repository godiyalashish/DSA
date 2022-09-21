class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        
        while(root != null){
            if(root.left == null){
                pre.add(root.val);
                root = root.right;
            }
            
            else{
                TreeNode t = root.left;
                while(t.right != null && t.right != root){
                    t = t.right;
                }
                
                if(t.right == null){
                    pre.add(root.val);
                    t.right = root;
                    root = root.left;
                }else if(t.right == root){
                    t.right = null;
                    root = root.right;
                }
            }
        }
        return pre;
    }
}