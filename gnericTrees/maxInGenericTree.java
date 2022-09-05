public static int max(Node node) {
    int max =Integer.MIN_VALUE;  
    for(Node child : node.children){
        int eleMax = max(child);
        max = Math.max(eleMax, max);
    }
    
    max =  Math.max(node.data, max);
    return max;
  }