class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count=0, sum=0;
        hm.put(0,1);
        for(int i : arr){
            sum += i;
            int rem = sum%k;
            if(rem < 0 ) rem+=k;

            if(hm.containsKey(rem)){
                int freq = hm.get(rem);
                count += freq;
                hm.put(rem, freq+1);
            }else{
                hm.put(rem,1);
            }
        }

        return count;
    }
}