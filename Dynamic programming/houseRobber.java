class Solution {
    public int rob(int[] nums) {
        int rb1=0, rb2=0;
        for(int n: nums){
            int temp = Math.max(rb1+n, rb2);
            rb1 = rb2;
            rb2 = temp;
        }
        return rb2;
    }
    
    
}