class Solution {
    int idx;
    HashMap<Integer, Integer> hm = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        idx = 0;
        for(int i=0; i<inorder.length; i++){
            hm.put(inorder[i], i);
        }
        return preOrderTraversal(preorder, inorder, 0, inorder.length-1);
    }
    
    public TreeNode preOrderTraversal(int [] preorder, int [] inorder, int left, int right){
        if(left > right) return null;
        int rval = preorder[idx++];
        TreeNode root = new TreeNode(rval);
        // int idx = findInInorder(inorder, left, right, rval);
        int idx = hm.get(rval);
        root.left = preOrderTraversal(preorder, inorder, left, idx-1);
        root.right = preOrderTraversal(preorder, inorder, idx+1, right);
        return root;
    }
    
    // public int findInInorder(int[] inorder, int left, int right, int val){
    //     while(left<=right){
    //         if(inorder[left] == val)return left;
    //         left++;
    //     }
    //     return -1;
    // }
}