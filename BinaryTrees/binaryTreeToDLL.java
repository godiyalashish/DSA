class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
	//  Your code here
	if(root == null)return null;
	Node headleft = bToDLL(root.left);
	Node headright = bToDLL(root.right);
	
	if(headleft == null && headright == null)return root;
	else if(headleft == null){
	    root.right = headright;
	    headright.left = root;
	    return root;
	}else{
	    Node lefttail = headleft;
	while(lefttail.right != null){
	    lefttail = lefttail.right;
	}
	
	lefttail.right = root;
	root.left = lefttail;
	if(headright!=null){
    	root.right = headright;
    	headright.left = root;
	    
	}
	}
	
	return headleft;
    }
}