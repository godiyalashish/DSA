class Solution {
    int postIdx;
    HashMap<Integer, Integer> hm = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIdx = postorder.length-1;
        for(int i=0; i<inorder.length; i++){
            hm.put(inorder[i], i);
        }
        return revPreorderTraversal(postorder, inorder.length-1, 0);
    }
    
    public TreeNode revPreorderTraversal(int[] postorder, int right, int left){
        if(left > right)return null;
        int rval = postorder[postIdx--];
        TreeNode root = new TreeNode(rval);
        int idx = hm.get(rval);
        root.right = revPreorderTraversal(postorder,right, idx+1 );
        root.left = revPreorderTraversal(postorder,idx-1, left );
        return root;
    }
}