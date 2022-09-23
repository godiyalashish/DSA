class Solution {
    public int rob(TreeNode root) {
       int ans[] = robHelper(root);
        return Math.max(ans[0], ans[1]);
    }
    private int[] robHelper(TreeNode node){
        if(node == null){
            return new int[2];
        }
        int left[] = robHelper(node.left);
        int right[] = robHelper(node.right);
        int ans[] = new int[2];
        ans[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        ans[1] = left[0] + right[0] + node.val;
        return ans;
    }  
    
}