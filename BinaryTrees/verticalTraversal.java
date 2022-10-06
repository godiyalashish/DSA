class Solution {
    class Pair{
        TreeNode node;
        int vlev;
        Pair(TreeNode node, int vlev){
            this.node = node;
            this.vlev = vlev;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root, 0));
        while(q.size()>0){
            HashMap<Integer, ArrayList<Integer>> tmap = new HashMap<>();
            int lsize = q.size();
            while(lsize != 0){
                Pair rem = q.remove();
                if(rem.node.left != null)q.add(new Pair(rem.node.left, rem.vlev-1));
                if(rem.node.right != null)q.add(new Pair(rem.node.right, rem.vlev+1));
                lsize--;
                ArrayList<Integer>list = tmap.get(rem.vlev);
                if(list == null){
                    list = new ArrayList<>();
                    tmap.put(rem.vlev, list);
                }
                list.add(rem.node.val);
            }
            MergeWithMap(map, tmap);
        }
        return createOutput(map);
    }
    
    public void MergeWithMap(HashMap<Integer,ArrayList<Integer>>map, HashMap<Integer,ArrayList<Integer>>tmap){
        for(Integer vlev : tmap.keySet()){
            ArrayList<Integer> list = tmap.get(vlev);
            ArrayList<Integer> mlist = map.get(vlev);
            
            if(mlist == null){
                mlist = new ArrayList<>();
                map.put(vlev, mlist);
            }
            Collections.sort(list);
            for(int val : list){
                mlist.add(val);
            }
        }
    }
    
    public  List<List<Integer>> createOutput(HashMap<Integer,ArrayList<Integer>>map){
        List<List<Integer>> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(Integer vlev : map.keySet()){
            max = Math.max(vlev, max);
            min = Math.min(vlev, min);
        }
        
        while(min <= max){
            List<Integer> tlist = map.get(min);
            list.add(tlist);
            min++;
        }
        return list;
    }
}