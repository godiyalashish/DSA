class Tree
{
        ArrayList<Integer> leftView(Node root){
            ArrayList <Integer> ans = new ArrayList<>();
            if(root == null) return ans;
            Queue<Node> main = new ArrayDeque<>();
            Queue<Node> child = new ArrayDeque<>();
            
            main.add(root);
            ans.add(root.data);
            while(main.size() > 0){
                Node node = main.remove();
                if(node.left!= null){
                    child.add(node.left);
                }
                if(node.right!= null){
                    child.add(node.right);
                }
                if(main.size() == 0){
                    if(child.size() > 0){
                        ans.add(child.peek().data);
                    }
                    main = child;
                    child = new ArrayDeque<>();
                }
            }
            return ans;
        }

        //Approach 2 using preorder traversal

//     ArrayList<Integer> leftView(Node root)
//     {
//       // Your code here
//       ArrayList<Integer> res = new ArrayList<>();
//       preorder(root,0,res);
//       return res;
//     }
    
//     void preorder(Node root, int level,ArrayList<Integer> res){
//         if(root == null) return;
//         if(level == res.size()){
//             res.add(root.data);
//         } 
//         preorder(root.left, level+1, res);
//         preorder(root.right, level+1, res);
// }
}