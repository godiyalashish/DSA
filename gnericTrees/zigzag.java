/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<List<Integer>>();
        int level = 0;
	    List<List<Integer>> ans = new ArrayList<>();
	    Stack<TreeNode> mst = new Stack<>();
	    Stack<TreeNode> cst = new Stack<>();
	    mst.push(root);
	    while(mst.size() > 0){
	        int size = mst.size();
            List<Integer> temp = new ArrayList<>();
	        for(int i=0; i<size; i++){
	            TreeNode rem = mst.pop();
	            temp.add(rem.val);
	            if(level%2 != 0){
	                if(rem.right != null) cst.push(rem.right);
	                if(rem.left != null) cst.push(rem.left);
	            }else{
	                if(rem.left != null) cst.push(rem.left);
	                if(rem.right != null) cst.push(rem.right);
	            }
	        }
            ans.add(temp);
	        mst = cst;
	        cst = new Stack<>();
	        level++;
	    }
        return ans;
    }
}