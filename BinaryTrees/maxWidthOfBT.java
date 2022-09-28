class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> mq = new ArrayDeque<>();
        HashMap<TreeNode, Integer> hm = new HashMap<>();
        int maxWidth=0;
        hm.put(root, 1);
        mq.add(root);
        
        while(mq.size() > 0){
            int size = mq.size();
            int start = 0, end =0;
            for(int i=1 ; i<=size; i++){
                TreeNode rem = mq.remove();
                if(i==1){
                    start = hm.get(rem);
                }
                if(i==size){
                    end = hm.get(rem);
                }
                if(rem.left != null){
                    mq.add(rem.left);
                    hm.put(rem.left, 2*(hm.get(rem)));
                }
                if(rem.right != null){
                    mq.add(rem.right);
                    hm.put(rem.right, 2*(hm.get(rem))+1);
                }
            }
            int width = end-start+1;
            maxWidth = Math.max(maxWidth, width);            
        }
        return maxWidth;
        
    }
}