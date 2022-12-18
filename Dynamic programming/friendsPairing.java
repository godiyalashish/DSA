class Solution
{
    public long countFriendsPairings(int n) 
    { 
       int dp[] = new int[n+1];
       dp[1] = 1;
       dp[2] = 2;
       for(int i=3; i<=n; i++){
           dp[i] = dp[i-1] + dp[i-2] * (n-1);
       }
       return dp[n];
    }
} 