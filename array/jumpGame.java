class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length == 1)return true;
        int n = nums.length;
        int l = nums.length-1, i=0;
        for(i = nums.length-2; i>=0; i--){
            if(nums[i]+i >= l) l=i;
        }
        if(l == 0)return true;
        return false;
    }
}