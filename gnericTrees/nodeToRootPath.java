public static ArrayList<Integer> nodeToRootPath(Node node, int data) {
    // write your code here
    if(node.data == data){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(node.data);
        return ans;
    }
    
    for(Node child : node.children){
        ArrayList<Integer> path = nodeToRootPath(child, data);
        if(path.size() > 0){
            path.add(node.data);
            return path;
        }
    }
    return (new ArrayList<>());
  }