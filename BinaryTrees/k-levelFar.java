class Solution {
    List<Integer> KLeveDown = new ArrayList<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<TreeNode> nodeToRootPath = NTRP(root, target);
        for(int i=0; i<nodeToRootPath.size(); i++){
            TreeNode node = nodeToRootPath.get(i);
            printKLevelDown(node, k-i, i==0?null:nodeToRootPath.get(i-1));
        }
        return KLeveDown;
    }
    
    public void printKLevelDown(TreeNode node, int k, TreeNode blocker){
        if(node == null || k<0 ||node == blocker )return;
        if(k == 0) {
           KLeveDown.add(node.val);
        }
            printKLevelDown(node.left, k-1, blocker);
            printKLevelDown(node.right, k-1, blocker);
    }
    
    public List NTRP(TreeNode root, TreeNode tar){
        List<TreeNode> ans;
        if(root == null){
            return null;
        }
        if(root.val == tar.val){
            List<TreeNode> bl = new ArrayList<>();
            bl.add(tar);
            return bl;
        }
        List<TreeNode>left = NTRP(root.left, tar);
        if(left != null && left.size() > 0){
            ans = left;
            ans.add(root);
            return ans;
        }
        List<TreeNode>right = NTRP(root.right, tar);
        if(right != null && right.size() > 0){
            ans = right;
            ans.add(root);
            return ans;
        }
        return new ArrayList<>();
    }
}