class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> res = new ArrayList<>();
      preorder(root,0,res);
      return res;
    }
    
    void preorder(Node root, int level,ArrayList<Integer> res){
        if(root == null) return;
        if(level == res.size()){
            res.add(root.data);
        } 
        preorder(root.left, level+1, res);
        preorder(root.right, level+1, res);
}
}