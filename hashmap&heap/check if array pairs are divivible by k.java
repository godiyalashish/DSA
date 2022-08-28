class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap <Integer, Integer> hm = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            int rem = arr[i]%k;
            if(rem <0){
                rem = k+rem;
            }
            if(hm.containsKey(rem) == false){
                hm.put(rem, 1);
            }else{
                
                Integer val  = hm.get(rem);
                hm.put(rem, val+1);
            }
        }
        
        System.out.print(hm);
        for(Integer ele : hm.keySet()){
            if(hm.get(ele)>0){
                Integer m = k-ele;
                if(ele == 0){
                    if(hm.get(ele)%2 == 0){
                        continue;
                    }else return false;
                }
                if(2*ele == k){
                    if(hm.get(ele)%2 == 0)continue;
                    else return false;
                }
                if(hm.get(m)!=null && hm.get(m)!=0){
                    Integer freq1 = hm.get(ele);
                    Integer freq2 = hm.get(m);
                    if(freq1 != freq2)return false;
                    hm.put(ele, freq1-1);
                    hm.put(m, freq2-1);
                }else return false;
            }
        }
        return true;
    }
}