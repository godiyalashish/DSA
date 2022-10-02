class GFG 
{
    //Function to construct the BST from its given level order traversal.
    public Node constructBST(int[] arr)
    {
        ArrayList<Integer> levelorder = new ArrayList<>();
        for(int node : arr){
            levelorder.add(node);
        }
        return construct(levelorder);
        
    }
    
    public Node construct(ArrayList<Integer>levelorder){
        if(levelorder.size() == 0)return null;
        
        int val = levelorder.get(0);
        Node root = new Node(val);
        if(levelorder.size() == 1) return root;
        ArrayList<Integer> leftlevel = new ArrayList<>();
        ArrayList<Integer> rightlevel = new ArrayList<>();
        for(int i=1; i<levelorder.size(); i++){//exclude first ele bcoz its root
            if(levelorder.get(i) < root.data){
                leftlevel.add(levelorder.get(i));
            }else rightlevel.add(levelorder.get(i));
        }
        root.left = construct(leftlevel);
        root.right = construct(rightlevel);
        
        return root;
    }
}