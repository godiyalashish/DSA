static ArrayList<Integer> ans;
  public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    ans = new ArrayList<>();
    nodeToRootPathHelper(node, data);
    return ans;
  }
  
  public static boolean find(Node node, int data){
    if(node == null) return false;
    
    if(node.data == data){ 
        ans.add(node.data);
        return true;
    }
    
   if(find(node.left, data)){
       ans.add(node.data);
       return true;
   }
    if(find(node.right, data)){
        ans.add(node.data);
        return true;
    }
    return false;
  }



// another method
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