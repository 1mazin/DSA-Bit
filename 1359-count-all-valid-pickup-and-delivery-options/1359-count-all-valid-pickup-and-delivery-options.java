class Solution {
    
    public int countOrders(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return  find(n,dp);
    }
    public int find(int n,int[] dp){
        int mod=1000000007;

        int temp=0;
        if(n==1)
        return 1;
        if(n==0)
        return 1;

        if(dp[n]!=-1)
        return dp[n];

        int remaining=find(n-1,dp);
        long tt=n*((2*(n-1)+1))*(long)remaining;
        long rem=tt%mod;

        
        return dp[n]=(int)rem;
    }
    
}