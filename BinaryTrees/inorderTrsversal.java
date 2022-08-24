class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            List<Integer> base  = new ArrayList<>();
            return base;
        }
        List<Integer> ans  = new ArrayList<>();
        List<Integer> left = inorderTraversal(root.left);
        for(Integer a: left){
            ans.add(a);
        }
        ans.add(root.val);
        List<Integer> right = inorderTraversal(root.right);
        for(Integer a: right){
            ans.add(a);
        }
        
        return ans;
    }
}