class Solution
{
    ArrayList<Integer> countDistinct(int A[], int n, int k)
    {
       HashMap <Integer, Integer> hm = new HashMap<>();
       ArrayList <Integer> ans = new ArrayList<>();
       int i=0,j=0;
       while(j <= k-1){
           if(hm.containsKey(A[j])){
               int freq = hm.get(A[j]);
               hm.put(A[j], freq+1);
           }else hm.put(A[j],1);
           j++;
       }
       ans.add(hm.size());
       
       while(j<A.length){
           int freq = hm.get(A[i]);
           if(freq > 1){
               hm.put(A[i], freq-1);
           }else{
               hm.remove(A[i]);
           }
           
           if(hm.containsKey(A[j])){
               int frq = hm.get(A[j]);
               hm.put(A[j], frq+1);
           }else hm.put(A[j],1);
           ans.add(hm.size());
           i++;
           j++;
       }
       
       return ans;
    }
}