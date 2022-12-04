public class Solution {
    public int lengthOfLIS(int[] nums) {            
        int[] dp = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            dp[i] = 1;
        }
        dp[nums.length-1] = 1;
        for(int i=nums.length-1; i>=0; i--){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]<nums[j]){
                    dp[i] = Math.max(dp[i], 1+dp[j]);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return max(dp);
    }
    
    public int max(int[]arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i])largest = arr[i];
        }
        return largest;
    }
}