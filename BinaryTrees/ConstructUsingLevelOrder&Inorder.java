class GfG
{
    Node buildTree(int inorder[], int levelorder[])
    {
        ArrayList<Integer> levelOrderList = new ArrayList<>();
        for(int level : levelorder){
            levelOrderList.add(level);
        }
        return buildTree(inorder, levelOrderList, 0, inorder.length-1);
    }
    Node buildTree(int inorder[], ArrayList<Integer> levelorder, int left, int right ){
        if(left > right)return null;
        int rval = levelorder.get(0);
        Node root = new Node(rval);
        if(levelorder.size() == 1)return root;
        
        int idx = left;
        HashSet<Integer> leftSideEle = new HashSet<>();
        while(inorder[idx] != rval){
            leftSideEle.add(inorder[idx++]);
        }
        ArrayList<Integer> leftLevelOrder = new ArrayList<>();
        ArrayList<Integer> rightLevelOrder = new ArrayList<>();
        
        for(int i=1; i<levelorder.size(); i++){
            int val = levelorder.get(i);
            if(leftSideEle.contains(val)){
                leftLevelOrder.add(val);
            }else rightLevelOrder.add(val);
        }
        
        root.left = buildTree(inorder, leftLevelOrder, left, idx-1);
        root.right = buildTree(inorder, rightLevelOrder, idx+1, right);
        return root;
    }
    
   
}