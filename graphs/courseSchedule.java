class Solution {
    HashMap<Integer, ArrayList<Integer>>hm;
    HashSet<Integer>set;
    public boolean canFinish(int numCourses, int[][] arr) {
        hm = new HashMap<>();
        for(int i=0;i<numCourses; i++){
            hm.put(i, new ArrayList<>());
        }
        for(int i=0; i<arr.length; i++){
            hm.get(arr[i][0]).add(arr[i][1]);
        }
        set = new HashSet<>();
        for(int i=0; i<numCourses; i++){
            if(!dfs(i))return false;
        }
        return true;
        
    }
    
    public boolean dfs(int crs){
        if(set.contains(crs)) return false;
        if(hm.get(crs).size() == 0)return true;
        set.add(crs);
        for(int pre : hm.get(crs)){
            if(!dfs(pre))return false;
        }
        set.remove(crs);
        hm.put(crs, new ArrayList<Integer>());
        return true;
        
    }
}