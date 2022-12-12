class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int n=0;
        Stack<TreeNode> st = new Stack<>();
        TreeNode cur = root;
        while(cur != null || st.size()>0){
            while (cur != null){
                st.push(cur);
                cur = cur.left;
            }
            cur = st.pop();
            n += 1;
            if(n == k)return cur.val;
            cur = cur.right;
            
        }
        return -1;
    }
}