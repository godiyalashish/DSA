class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int sum=0, count=0;
        hm.put(0,1);
        for(int i : nums){
            sum += i;
            Integer freq = hm.get(sum-k);
            if(freq != null){
                count += freq;
            }if(hm.get(sum) != null){
                int f = hm.get(sum);
                hm.put(sum,f+1);
            }else hm.put(sum,1);
        }
        
        return count;
    }
}