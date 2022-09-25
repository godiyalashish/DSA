/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class Pair{
        TreeNode node;
        int count;
        Pair(TreeNode node, int count){
            this.node = node;
            this.count = count;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        HashMap<Integer, PriorityQueue<Integer>> hm = new HashMap<>();
        Queue<Pair> q = new ArrayDeque<>();
        int max=0, min =0;
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        
        q.add(new Pair(root, 0));
        while(q.size() > 0){
            Pair rem = q.remove();
            if(hm.containsKey(rem.count)){
                PriorityQueue<Integer> list = hm.get(rem.count);
                list.add(rem.node.val);
            }else{
                PriorityQueue<Integer> list = new PriorityQueue<>();
                list.add(rem.node.val);
                hm.put(rem.count, list);
            }
            min = Math.min(min, rem.count);
            max = Math.max(max, rem.count);
            if(rem.node.left != null) q.add(new Pair(rem.node.left, rem.count-1));
            if(rem.node.right != null) q.add(new Pair(rem.node.right, rem.count+1));
        }
        
        while(min <= max){
            PriorityQueue<Integer> pq = hm.get(min);
            ArrayList<Integer> l = new ArrayList<>();
            while(pq.size()>0){
                l.add(pq.remove());
            }
            ans.add(l);
            min++;
        }
        return ans;
    }
}