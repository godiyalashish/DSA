class Solution {
    public TreeNode tailNode(TreeNode node){
        if(node == null){
            return null;
        }
        while(node.right!=null){
            node = node.right;
        }
        return node;
    }
    
    public void flatten(TreeNode root) {
        if (root == null)return;
        flatten(root.right);
        flatten(root.left);
        
        if(root.left != null){
            TreeNode lchild = root.left;
            TreeNode rchild = root.right;
            TreeNode Tlchild = tailNode(lchild);
        
            root.right = lchild;
            Tlchild.right = rchild;
            root.left = null;
        }
    }
    }