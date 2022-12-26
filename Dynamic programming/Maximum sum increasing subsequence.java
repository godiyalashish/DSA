class Solution
{
	public int maxSumIS(int a[], int n)  
	{ 
	    int dp[] = new int[a.length];
        dp[0] = a[0];
        for(int i=1; i<a.length; i++){
            int maxSum = 0;
            for(int j=0; j<i; j++){
                if(a[i] > a[j]){
                    maxSum = Math.max(maxSum, dp[j]);
                }
            }
            dp[i] = maxSum + a[i];
        }
        return max(dp);
    }
    
    public int max(int a[]){
        int max = 0;
        for(int i : a){
            max = Math.max(max, i);
        }
        return max;
    }  
}