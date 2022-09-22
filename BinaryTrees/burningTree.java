class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    static ArrayList<Node> path;
    public static int height(Node node){
        if(node == null) return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        return Math.max(lh, rh)+1;
    }
    public static int minTime(Node root, int target) 
    {
        path = new ArrayList<>();
        if(path == null)return 0;
        NTRP(root, target);
        int maxtime = 0;
        for(int i=0; i<path.size(); i++){
            Node node = path.get(i);
            if(i ==0){
               maxtime = height(node)-1;
            }else{
                if(node.left == path.get(i-1)){
                    maxtime = Math.max(maxtime, height(node.right)+i);
                }else{
                    maxtime = Math.max(maxtime, height(node.left)+i);
                }
            }
        }
        return maxtime;
    }
    
    public static boolean NTRP(Node node, int target){
        if(node == null) return false;
        if(node.data == target){
            path.add(node);
            return true;
        }
        if(NTRP(node.left, target)){
            path.add(node);
            return true;
        }else if(NTRP(node.right, target)){
            path.add(node);
            return true;
        }
        return false;
    }
}