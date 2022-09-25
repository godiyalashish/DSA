class Solution
{
    
    static class Pair{
        Node node;
        int count;
        Pair(Node node, int count){
            this.node = node;
            this.count = count;
        }
    }
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Pair> mq = new ArrayDeque<>();
        Queue<Pair> cq = new ArrayDeque<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int min = 0;
        int max = 0;
        
        mq.add(new Pair(root, 0));
        while(mq.size() > 0){
            Pair p = mq.remove();
                hm.put(p.count, p.node.data);
            min = Math.min(min, p.count);
            max = Math.max(max, p.count);
            if(p.node.left != null){
                mq.add(new Pair(p.node.left, p.count-1));
            }
            if(p.node.right != null){
                mq.add(new Pair(p.node.right, p.count+1));
            }
        }
        
        for(int i = min; i<=max; i++){
            ans.add(hm.get(i));
        }
        return ans;
    }
}