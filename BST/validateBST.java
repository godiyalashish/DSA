class Solution {
    class Pair{
        long min;
        long max;
        boolean isBst;        
    }
    public boolean isValidBST(TreeNode root) {
       return (validateBST(root)).isBst;
    }
    
    public Pair validateBST(TreeNode root){
        if(root ==  null){
            Pair bp = new Pair();
            bp.min = Long.MAX_VALUE;
            bp.max = Long.MIN_VALUE;
            bp.isBst = true;
            return bp;
        }
        Pair left = validateBST(root.left);
        Pair right = validateBST(root.right);
        
        Pair myPair = new Pair();
        myPair.max  = Math.max(root.val, Math.max(left.max, right.max));
        myPair.min  = Math.min(root.val, Math.min(left.min, right.min));
        myPair.isBst = left.isBst && right.isBst &&(root.val > left.max && root.val < right.min);
        return myPair;
    }
}

//Solution 2
class Solution {
    
    public boolean isValidBST(TreeNode root) {
       return validateHelper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean validateHelper(TreeNode root, long lb, long rb){
        if(root == null) return true;
        boolean left = validateHelper(root.left, lb, root.val);
        boolean right = validateHelper(root.right, root.val, rb);
        
        boolean ans = root.val < rb && root.val > lb && left && right;
        return ans;
    }
}
